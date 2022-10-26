package com.projeto.finan.service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.finan.model.Companhia;
import com.projeto.finan.repository.CompanhiaRepository;

@Service
public class CompanhiaService {

	@Autowired
	private CompanhiaRepository compRepository;

	@Transactional
	public Companhia salvar(String nome) {
		var companhiaModel = new Companhia();
		companhiaModel.setNome(nome.toUpperCase());
		companhiaModel.setDataCadastro(LocalDateTime.now(ZoneId.of("UTC")));
		return compRepository.save(companhiaModel);
	}

	public boolean existsByCompany(String nome) {
		return compRepository.existsByNome(nome);
	}

	public List<Companhia> getAll() {
		return compRepository.findAll();
	}

	public Companhia getById(Integer idCompanhia) {
		return compRepository.findById(idCompanhia).get();
	}

}
