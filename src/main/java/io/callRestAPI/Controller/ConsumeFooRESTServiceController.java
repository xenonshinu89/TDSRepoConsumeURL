package io.callRestAPI.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import io.callRestAPI.Model.Foo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class ConsumeFooRESTServiceController  {
	
	private static final Logger logger = LoggerFactory.getLogger(ConsumeFooRESTServiceController.class);
	
	@GetMapping("/getFooDetails")
	public ModelAndView callRestService() throws JsonMappingException, JsonProcessingException {
		
		logger.info("Inside Consuming Foo REST service");
		ModelAndView restCallMV=new ModelAndView();
		
		RestTemplate rt=new RestTemplate();
		String fooResourceUrl= "https://postman-echo.com/get?foo1=bar1&foo2=bar2";
		ResponseEntity<String> response= rt.getForEntity(fooResourceUrl , String.class);
		//Foo foo = rt.getForObject(fooResourceUrl , Foo.class);
		
		logger.info(response.getBody());
		
		
		ObjectMapper mapper = new ObjectMapper(); 
		Foo foo = mapper.readValue(response.getBody(),Foo.class); 
		 
		restCallMV.addObject("foo", foo);
		restCallMV.addObject("title", "Show Foo Details");
		restCallMV.setViewName("showFooDetails");
		return restCallMV;
		 
	
	}

	

	
}
