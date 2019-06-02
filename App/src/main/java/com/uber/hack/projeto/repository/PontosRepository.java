package com.uber.hack.projeto.repository;

import com.uber.hack.projeto.model.Pontos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PontosRepository extends JpaRepository<Pontos,Long> {
}
