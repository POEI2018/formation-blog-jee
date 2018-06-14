package fr.gtm.blog.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BlogServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * Point d'entrée de la requête HTTP envoyée par le client (navigateur).
	 */
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Récupération d'un objet permettant d'écrire dans la réponse renvoyée
		// au client.
		final PrintWriter writer = response.getWriter();
		// Ecriture de chaînes de caractères dans le buffer d'un flux
		// représentant le corps de la réponse HTTP.
		writer.append("<html>");
		writer.append("<body>");
		writer.append("<h1>HelloWorld servlet !!</h1>");
		writer.append("</body>");
		writer.append("</html>");
		writer.flush();
	}
}
