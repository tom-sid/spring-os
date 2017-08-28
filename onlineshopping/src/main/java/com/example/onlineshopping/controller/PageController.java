package com.example.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping({ "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("greeting", "Welcome to the world of spring MVC!");
		return modelAndView;
	}

//	@RequestMapping({ "/test" })
//	public ModelAndView test(@RequestParam(value="greeting", required=false) String greeting) {
//		ModelAndView modelAndView = new ModelAndView("page");
//		modelAndView.addObject("greeting", greeting);
//		return modelAndView;
//	}
	
	@RequestMapping({ "/test/{greeting}" })
	public ModelAndView test(@PathVariable("greeting") String greeting) {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("greeting", greeting);
		return modelAndView;
	}
}
