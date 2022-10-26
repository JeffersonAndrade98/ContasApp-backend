package com.projeto.finan.model.enums;

public enum TipoContaEnum {
	
	BOLETO("Boleto"),
	FATURA("Fatura"),
	PGTO_DIVERSOS("Pagamentos Diversos"),
	CARTÃO_CREDITO("Cartão de Credito");

	private String value;
	
	TipoContaEnum(String string){
		this.value = string;
	}

	public String getValue() {
		return value;
	}

}
