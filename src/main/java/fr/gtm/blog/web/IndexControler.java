package fr.gtm.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexControler {
	// Annotation qui dit a notre methode de fonctionner comme une servlet qui reçoit des requettes HTTP
	@RequestMapping("/articles")
	public ModelAndView index() {
		final ModelAndView mav = new ModelAndView("index") ; 
		return mav ; 
	}

}
