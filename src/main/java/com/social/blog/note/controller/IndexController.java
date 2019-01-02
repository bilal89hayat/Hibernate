package com.social.blog.note.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping("/home")
	public String home() 
	{
	 return "================= fuck off =================";
	}
	
}
