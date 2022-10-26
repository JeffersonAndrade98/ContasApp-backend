package com.projeto.finan.controller;

import java.time.LocalDateTime;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.finan.model.Companhia;
import com.projeto.finan.model.Contas;
import com.projeto.finan.model.Pagamentos;
import com.projeto.finan.model.dto.PagamentoDto;
import com.projeto.finan.service.CompanhiaService;
import com.projeto.finan.service.ContasService;
import com.projeto.finan.service.PagamentosService;

@RestController
@RequestMapping("/pagamentos")
public class PagamentosController {
	
	@Autowired
	private PagamentosService pagamentoService;
	
	@PostMapping("/save")
	public ResponseEntity<Object> saveCompany(@Valid PagamentoDto pagDto){
		return ResponseEntity.status(HttpStatus.CREATED).body(pagamentoService.salvar(pagDto)); 
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(pagamentoService.getAll());
	}

}
