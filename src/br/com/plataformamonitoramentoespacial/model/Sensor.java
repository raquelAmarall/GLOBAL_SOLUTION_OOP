package br.com.plataformamonitoramentoespacial.model;

public interface Sensor {
	
	void lerValor();
	void verificarFuncionamento();
	String retornaTipo();
	void detectarLimite();

}
