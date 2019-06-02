package com.uber.hack.projeto.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Estacoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double lotacao;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "estacoes_id")
    private List<Tren> trens;

    public List<Tren> getTrens() {
        return trens;
    }

    public void setTrens(List<Tren> trens) {
        this.trens = trens;
    }

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
}
