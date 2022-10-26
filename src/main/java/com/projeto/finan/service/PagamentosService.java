package com.projeto.finan.service;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.finan.model.Contas;
import com.projeto.finan.model.Pagamentos;
import com.projeto.finan.model.dto.PagamentoDto;
import com.projeto.finan.repository.PagamentosRepository;

@Service
public class PagamentosService {

	@Autowired
	private PagamentosRepository pagRepository;
	
	@Autowired
	private ContasService contaService;
	
	@Transactional
	public Pagamentos salvar(@Valid PagamentoDto pagDto) {
		var pagamentosModel = new Pagamentos();
		BeanUtils.copyProperties(pagDto, pagamentosModel);
		pagamentosModel.setConta(contaService.getById(pagDto.getIdConta()));
		pagamentosModel.setDataPagamento(LocalDateTime.now());
		return pagRepository.save(pagamentosModel);
	}

	public List<Pagamentos> getAll() {
		return pagRepository.findAll();
	}

}
