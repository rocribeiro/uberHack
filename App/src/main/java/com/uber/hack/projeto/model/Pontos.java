package com.uber.hack.projeto.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pontos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double lotacao;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pontos_id")
    private List<Onibus> onibus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getLotacao() {
        return lotacao;
    }

    public void setLotacao(Double lotacao) {
        this.lotacao = lotacao;
    }

    public List<Onibus> getOnibus() {
        return onibus;
    }

    public void setOnibus(List<Onibus> onibus) {
        this.onibus = onibus;
    }
}
