package com.jeanlima.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeanlima.springmvcdemo.model.Estudante;

@Controller
@RequestMapping("/estudante")
public class EstudanteController {

    @RequestMapping("/showForm")
    public String showFormEstudante(Model model){

        model.addAttribute("estudante", new Estudante());
        return "estudante/formEstudante";
    }

    @RequestMapping("/addEstudante")
    public String showFormEstudante(@ModelAttribute("estudante") Estudante estudante,  Model model){

       // model.addAttribute("estudante", new Estudante());
        System.out.println(estudante.toString());

        model.addAttribute("estudante", estudante);
        return "estudante/paginaEstudante";
    }
    
}
