package com.jeanlima.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    
    @GetMapping("/ola")
	public String saudar(@RequestParam(name="name", required=false, defaultValue="Mundo") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

    @GetMapping("/teste")
	public String teste() {
		//model.addAttribute("name", name);
        System.out.println("TESTOU");
		return "olá mundo";
	}
}
