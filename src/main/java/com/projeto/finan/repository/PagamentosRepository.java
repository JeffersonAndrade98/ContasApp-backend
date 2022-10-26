package com.projeto.finan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.finan.model.Pagamentos;

@Repository
public interface PagamentosRepository extends JpaRepository<Pagamentos, Integer>{

}
