package com.projeto.finan.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.finan.model.Companhia;
import com.projeto.finan.model.Contas;
import com.projeto.finan.model.dto.ContaDto;
import com.projeto.finan.service.CompanhiaService;
import com.projeto.finan.service.ContasService;

@RestController
@CrossOrigin("*")
@RequestMapping("/contas")
public class ContasController {
	
	@Autowired
	private ContasService contaService;
	
	@PostMapping("/save")
	public ResponseEntity<?> saveCompany(@Valid ContaDto contaDto){
		return ResponseEntity.status(HttpStatus.CREATED).body(contaService.salvar(contaDto)); 
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(contaService.getAll());
	}
	
	@GetMapping("/tipoConta")
	public ResponseEntity<?> getTipoConta(){
		return ResponseEntity.status(HttpStatus.OK).body(contaService.getTipoConta());
	}

}
