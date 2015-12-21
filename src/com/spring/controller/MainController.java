package com.spring.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
// concate url before request mapping below
public class MainController {

	@RequestMapping("/welcome")
	// http://localhost:8080/Spring-MVC/greet/welcome
	public ModelAndView helloWorld() {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("welcomeMessage", "Hello Spring");
		return modelAndView;
	}

	@RequestMapping("/hi/{username}/and/{location}")
	public ModelAndView hiWorld(@PathVariable Map<String, String> pathVars) {
		
		// use map instead of multiple @PathVariable in parameter
		
		// public ModelAndView hiWorld(@PathVariable("username") String name,
		// @PathVariable("location") String location) {
		
		String name = pathVars.get("username");
		String location = pathVars.get("location");

		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("welcomeMessage", "hi " + name + " are from "
				+ location);
		return modelAndView;
	}

}
