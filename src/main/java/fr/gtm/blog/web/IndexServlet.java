package fr.gtm.blog.web;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.gtm.blog.domain.Article;

/**
 * Point d'entrée dans l'application par l'URL '/articles'. Permet de traiter
 * les requêtes HTTP en fournissant pour chaque demande un objet de réponse.
 */
public class IndexServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final List<Article> articles = Collections
			.unmodifiableList(Arrays.asList(
					new Article[] { new Article(0, "Article n°1", "DESCR"),
							new Article(1, "Article n°2", "DESCR"),
							new Article(2, "Article n°3", "DESCR") }));

	/**
	 * Point d'entrée pour une requête HTTP (<b>method=GET</b>) envoyée par le
	 * client (navigateur), permet d'afficher la liste des articles.
	 */
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listArticle", IndexServlet.articles);
		this.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/index.jsp")
				.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// Récupérer les paramètres title et description.
		// Construire un nouvel Article et le persister en BDD.
		// Afficher la nouvelle liste d'articles.
	}
}
