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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.finan.model.dto.CompanhiaDto;
import com.projeto.finan.service.CompanhiaService;

@RestController
//@CrossOrigin(origins = "*", maxAge = 3600)
@CrossOrigin("*")
@RequestMapping("/companhia")
public class CompanhiaController {
	
	@Autowired
	private CompanhiaService compService;
	
	@PostMapping("/save")
	public ResponseEntity<Object> saveCompany(@RequestParam(value = "nome", required = true) String nome){
		if (compService.existsByCompany(nome.toUpperCase())) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Companhia já cadastrada!");
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(compService.salvar(nome)); 
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(compService.getAll());
	}

}
