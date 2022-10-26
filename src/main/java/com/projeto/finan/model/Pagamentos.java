package com.projeto.finan.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.projeto.finan.model.enums.ContaStatus;
import com.projeto.finan.model.enums.MeioPagamento;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_pagamentos")
public class Pagamentos implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "fk_conta")
	private Contas conta;
	
	@Column(nullable = false)
	private Float valorPago;

	private Float valorRestante;
	
	@Column(nullable = false)
	private LocalDateTime dataPagamento;
	
	@Enumerated(EnumType.STRING)
	private MeioPagamento meioPagamento;
	
	@Enumerated(EnumType.STRING)
	private ContaStatus status;
	
}
