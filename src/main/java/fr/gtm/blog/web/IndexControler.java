package fr.gtm.blog.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.gtm.blog.business.ArticleService;
import fr.gtm.blog.domain.Article;

@Controller
public class IndexControler {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(IndexControler.class);
	
	@Autowired
	private ArticleService articleService ; 
	
	// Annotation qui dit a notre methode de fonctionner comme une servlet qui reçoit des requettes HTTP
	@RequestMapping({"/index", "/articles"})
	public ModelAndView index() {
		final ModelAndView mav = new ModelAndView("index") ;
		mav.addObject("listArticle", articleService.getList());
		return mav ; 
	}
	
	@PostMapping("/index")
	public ModelAndView getArticleByName(@RequestParam("title") String id ) {
        LOGGER.info(id);
		ModelAndView mav = new ModelAndView("index") ;
		if (id.equals(""))
			mav.addObject("listArticle", articleService.getList());
		else 
			mav.addObject("listArticle", articleService.findArticleByTitle(id));
		return mav ; 
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") Integer id) {
		articleService.delete(id);
		
		return "redirect:/index.html";
		
	}
	
	@RequestMapping("/manage")
	public String vueSubmit() {
		return "article" ;
	}
	
	@PostMapping("/manage")
	public String submit(@RequestParam("title") String nom, @RequestParam("descr") String desc, @RequestParam("id") Integer id ) {
		
		 if (id == null)  
		     articleService.create(new Article(nom, desc));
		 else {
			 Article article = new Article(nom, desc) ;
			 article.setId(id);
			 articleService.edit(article) ;
		 }
		
		return "redirect:/index.html" ; 
	}
	
	
	
	

}
