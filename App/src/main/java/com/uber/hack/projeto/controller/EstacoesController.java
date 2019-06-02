package com.uber.hack.projeto.controller;

import com.uber.hack.projeto.model.Estacoes;
import com.uber.hack.projeto.service.EstacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
@RequestMapping("/estacoes")
public class EstacoesController {

    @Autowired
    private EstacoesService es;

    @GetMapping("/")
    public ModelAndView buscarEstacoes(Model model){
        model.addAttribute("estacoes" , es.buscarEstacoes());

        return new ModelAndView("index");
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public void addEstacoes(@RequestBody Estacoes Estacoes){
        es.addEstacoes(Estacoes);
    }

}
