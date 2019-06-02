package com.uber.hack.projeto.repository;

import com.uber.hack.projeto.model.Estacoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstacoesRepository extends JpaRepository<Estacoes,Long> {
}
