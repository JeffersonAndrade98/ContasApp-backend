package com.projeto.finan.model.enums;

public enum ContaStatus {
	
	PAGO("PG"),
	PAGO_PARCIAL("PP"),
	ABERTO("AB"),
	VENCIDO("VD"),
	NAO_PAGO("NP"),
	CANCELADO("CD");

	private String value;
	
	ContaStatus(String string){
		this.value = string;
	}

	public String getValue() {
		return value;
	}

}
