package com.uber.hack.projeto.controller;

import com.uber.hack.projeto.model.Estacoes;
import com.uber.hack.projeto.model.Pontos;
import com.uber.hack.projeto.service.EstacoesService;
import com.uber.hack.projeto.service.PontosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/pontos")
public class PontosController {

    @Autowired
    private PontosService ps;

    @GetMapping("/")
    public @ResponseBody List<Pontos> buscarPontos(){
        return ps.buscarPontos();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public void addPontos(@RequestBody Pontos pontos){
        ps.addPontos(pontos);
    }

}
