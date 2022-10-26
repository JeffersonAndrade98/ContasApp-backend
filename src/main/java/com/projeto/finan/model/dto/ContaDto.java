package com.projeto.finan.model.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.projeto.finan.model.enums.Mes;
import com.projeto.finan.model.enums.TipoContaEnum;

import lombok.Data;

@Data
public class ContaDto {
	
	private Mes mes;
	
	private Integer ano;
	
	private Integer idCompanhia;
	
	private TipoContaEnum tipoConta;
	
	private Float valor;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", locale = "pt-BR", timezone = "Brazil/East")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate vencimento;

}
