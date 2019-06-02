package com.uber.hack.projeto.service;

import com.uber.hack.projeto.model.Estacoes;

import com.uber.hack.projeto.model.Pontos;
import com.uber.hack.projeto.repository.PontosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PontosService {
    @Autowired
    private PontosRepository pr;

    public List<Pontos> buscarPontos(){
        return pr.findAll();
    }

    public void addPontos(Pontos pontos){
        pr.saveAndFlush(pontos);
    }
}
