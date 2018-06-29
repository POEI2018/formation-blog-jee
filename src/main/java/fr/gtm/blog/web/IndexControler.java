package fr.gtm.blog.web;

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
	
	@Autowired
	private ArticleService articleService ; 
	
	// Annotation qui dit a notre methode de fonctionner comme une servlet qui reçoit des requettes HTTP
	@RequestMapping({"/index", "/articles"})
	public ModelAndView index() {
		final ModelAndView mav = new ModelAndView("index") ;
		mav.addObject("listArticle", articleService.getList());
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
