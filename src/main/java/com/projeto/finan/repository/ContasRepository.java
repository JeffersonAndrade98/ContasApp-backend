package com.projeto.finan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.finan.model.Contas;

@Repository
public interface ContasRepository extends JpaRepository<Contas, Integer>{

}
