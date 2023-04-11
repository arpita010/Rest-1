package com.app.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*",maxAge=3600)
public class MainController {

	@RequestMapping("/")
	public String welcome()
	{
		return "Welcome to our first ever deployed Spring application";
	}
	@RequestMapping("/page")
	public String anotherPage()
	{
		return "Next page of deployed REST API";
	}
}
