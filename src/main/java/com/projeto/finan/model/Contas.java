package com.projeto.finan.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.projeto.finan.model.enums.ContaStatus;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_contas")
public class Contas implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idConta;
	
	@Column(nullable = false)
	private Integer mes;
	
	@Column(nullable = false)
	private Integer ano;
	
	@ManyToOne
	@JoinColumn(name = "fk_companhia")
	private Companhia companhia;
	
//	@Column(nullable = false)
//	@Enumerated(EnumType.STRING)
//	private TipoConta tipoConta;
	
	@ManyToOne
	@JoinColumn(name = "fk_tipo_conta")
	private TipoConta tipoConta;
	
	@Column(nullable = false)
	private Float valor;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", locale = "pt-BR", timezone = "Brazil/East")
	@Column(nullable = false)
	private LocalDate vencimento;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private ContaStatus status = ContaStatus.ABERTO;
	
}
