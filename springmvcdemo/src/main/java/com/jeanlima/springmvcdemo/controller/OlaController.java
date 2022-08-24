package com.jeanlima.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class OlaController {
    
    @RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form";
	}
}
