package com.jeanlima.springmvcdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@GetMapping("/")
    public String shwoPage(){
		return "main-menu";
	}
    @GetMapping("/ola")
	public String saudar(@RequestParam(name="name", required=false, defaultValue="Mundo") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

    @GetMapping("/olahtml")
	public String saudarhtml(@RequestParam(name="name", required=false, defaultValue="Mundo") String name, Model model) {
		model.addAttribute("name", name);
		return "ola";
	}

	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request, Model model){

		String paramNome = request.getParameter("studentName");
		model.addAttribute("studentName", paramNome);
		return "helloworld";
	}

	@RequestMapping("/processFormDois")
	public String processFormDois(@RequestParam("studentName") String nome, Model model){

		//String paramNome = request.getParameter("studentName");
		nome = nome.toUpperCase();
		String result = "Olá! " + nome;
		model.addAttribute("msg", result);
		return "helloworld";
	}

}
