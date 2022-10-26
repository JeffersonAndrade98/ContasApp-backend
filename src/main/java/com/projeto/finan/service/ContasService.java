package com.projeto.finan.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.finan.model.Contas;
import com.projeto.finan.model.dto.ContaDto;
import com.projeto.finan.model.enums.TipoContaEnum;
import com.projeto.finan.repository.ContasRepository;

@Service
public class ContasService {

	@Autowired
	private ContasRepository contaRepository;
	
	@Autowired
	private CompanhiaService compService;
	
	@Transactional
	public Contas salvar(@Valid ContaDto contaDto) {
		var contasModel = new Contas();
		BeanUtils.copyProperties(contaDto, contasModel);
		contasModel.setCompanhia(compService.getById(contaDto.getIdCompanhia()));
		Integer mes = contaDto.getVencimento().getMonthValue();
		Integer ano = contaDto.getVencimento().getYear();
		
		contasModel.setMes(mes-1);
		contasModel.setAno(ano);
		return contaRepository.save(contasModel);
	}

	public Contas getById(Integer conta) {
		return contaRepository.findById(conta).get();
	}

	public List<Contas> getAll() {
		return contaRepository.findAll();
	}

	public TipoContaEnum[] getTipoConta() {
		return TipoContaEnum.values();
	}

}
