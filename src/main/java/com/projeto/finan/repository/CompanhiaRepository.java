package com.projeto.finan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.finan.model.Companhia;

@Repository
public interface CompanhiaRepository extends JpaRepository<Companhia, Integer>{

	boolean existsByNome(String nome);

}
