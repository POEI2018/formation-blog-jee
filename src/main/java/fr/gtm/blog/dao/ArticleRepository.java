package fr.gtm.blog.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fr.gtm.blog.domain.Article;

@Repository
public interface ArticleRepository extends JpaRepository <Article, Integer> {
	
	 
	 @Query(value = "SELECT * FROM article WHERE title LIKE CONCAT('%',?1,'%')", nativeQuery = true)
	  List<Article> findArticleByTitle(String title);

}
