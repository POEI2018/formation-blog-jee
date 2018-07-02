package fr.gtm.blog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.gtm.blog.business.ArticleService;
import fr.gtm.blog.domain.Article;

@RestController
@RequestMapping("/api/article")
public class ArticleWebService {
	
	@Autowired
	private ArticleService articleService ; 
	
	@PostMapping({"", "/"})
	public Article create (@RequestBody Article article) {
		return this.articleService.create(article) ; 
	}
	
	@GetMapping("")
	public List<Article> readAll() {
		return this.articleService.getList() ;
	}
	
	@GetMapping("/{id}")
	public Article readOne(@PathVariable Integer id) {
       return this.articleService.read(id) ;
	}
}
