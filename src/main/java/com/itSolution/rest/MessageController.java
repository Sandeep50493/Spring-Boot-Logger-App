package com.itSolution.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	private Logger logger=LoggerFactory.getLogger(MessageController.class);
	
	
	
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
	    
		logger.debug("This is debugger message from welcome message");
		logger.info("welcomeMsg() execution started......");
		String msg="Welcome to My Home Page";
		
		try {
			int i=10/0;
		} catch (Exception e) {
			logger.error("Exception Occurred...."+e.getMessage());
		}
		
		
		logger.warn("This is warning message from welcome message");
		logger.info("welcomeMsg() execution ended......");
		return msg;
	}
	@GetMapping("/greet")
	public String greetMsg() {
		logger.info("greetMsg() execution started......");
		String msg="Good Morning....";
		logger.info("greetMsg() execution ended......");
		return msg;
	}

}
