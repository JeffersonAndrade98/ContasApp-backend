package com.projeto.finan.model.dto;

import com.projeto.finan.model.enums.ContaStatus;
import com.projeto.finan.model.enums.MeioPagamento;

import lombok.Data;

@Data
public class PagamentoDto {
	
	private Integer idConta;
	
	private Float valorPago;
	
	private MeioPagamento meioPagamento;
	
	private ContaStatus status;

}
