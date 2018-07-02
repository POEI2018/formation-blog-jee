package fr.gtm.blog.business;

import java.util.List;

import fr.gtm.blog.dao.ArticleRepository;
import fr.gtm.blog.domain.Article;


public class ArticleService extends CrudService<Article> {
	
	public ArticleRepository getRepo() {
		return (ArticleRepository)this.repo ;	
	}
	
	public List<Article> findArticleByTitle(String title) {
		return  this.getRepo().findArticleByTitle(title);
	}

}