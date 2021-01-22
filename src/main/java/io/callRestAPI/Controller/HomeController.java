package io.callRestAPI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/")
	public ModelAndView getHomePage() {
		
		ModelAndView homeMV=new ModelAndView();
		homeMV.addObject("title","Call Foo API");
		homeMV.setViewName("Home");
		return homeMV;
	}
	
}
