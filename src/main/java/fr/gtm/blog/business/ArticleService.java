package fr.gtm.blog.business;

import fr.gtm.blog.domain.Article;


public class ArticleService extends CrudService<Article> {
	
	public Article create(Article entity) {
		if (entity.getAuteur() != null && (entity.getAuteur().getId() != null || entity.getAuteur().getName() != null  )) {
			return super.create(entity) ; 			
		} else {
			throw new IllegalArgumentException("Impossible de creer un article sans auteur") ; 
		}
	}

}