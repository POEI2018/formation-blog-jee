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

public class IndexServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final List<Article> articles = Collections
			.unmodifiableList(Arrays.asList(
					new Article[] { new Article(0, "Article n°1", "DESCR"),
							new Article(1, "Article n°2", "DESCR"),
							new Article(2, "Article n°3", "DESCR") }));

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listArticle", IndexServlet.articles);
		this.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/index.jsp")
				.forward(request, response);
	}
}
