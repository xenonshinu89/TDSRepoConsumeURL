package io.callRestAPI.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	 
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	
	@GetMapping("/")
	public ModelAndView getHomePage() {
		
		logger.info("Inside Home Contoller");
		ModelAndView homeMV=new ModelAndView();
		homeMV.addObject("title","Call Foo API");
		homeMV.setViewName("Home");
		return homeMV;
	}
	
}
