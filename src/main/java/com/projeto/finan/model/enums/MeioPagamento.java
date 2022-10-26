package com.projeto.finan.model.enums;

public enum MeioPagamento {
	
	DINHEIRO("DO"),
	PIX("PX"),
	CREDITO("CR"),
	DEBITO("DT");

	private String value;
	
	MeioPagamento(String string){
		this.value = string;
	}

	public String getValue() {
		return value;
	}

}
