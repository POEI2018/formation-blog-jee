package fr.gtm.blog.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.blog.business.ArticleService;
import fr.gtm.blog.business.AuteurService;
import fr.gtm.blog.domain.Article;
import fr.gtm.blog.domain.Auteur;

public class ArticleServlet extends AutoWiredServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory
			.getLogger(ArticleServlet.class);

	@Autowired 
	private ArticleService articleService ; 
	@Autowired
	private AuteurService auteurService ; 
	
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/article.jsp")
				.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Récupérer les paramètres 'title' et 'descr'.
		final String title = request.getParameter("title");
		final String description = request.getParameter("descr");
		Article c = new Article(title, description);
		String auteurName = request.getSession().getAttribute(AuthFilter.SESSION_AUTH).toString(); 
		Auteur auteur = this.auteurService.searchAuteur(auteurName) ;
		if (auteur == null) {
			auteur = new Auteur() ;
			auteur.setName(auteurName);
		}
		
		
		this.articleService.create(c);
		LOGGER.debug("Creation d'un nouvel article {}: {}", c.getTitle(), c.getDescription() ) ;
		response.sendRedirect(
				this.getServletContext().getContextPath() + "/articles");
	}
}
