package com.uber.hack.projeto.service;

import com.uber.hack.projeto.model.Estacoes;
import com.uber.hack.projeto.repository.EstacoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstacoesService {
    @Autowired
    private EstacoesRepository er;

    public List<Estacoes> buscarEstacoes(){
        return er.findAll();
    }

    public void addEstacoes(Estacoes estacoes){
        er.saveAndFlush(estacoes);
    }


}
