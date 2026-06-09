package br.com.plataformamonitoramentoespacial.model;

public class SensorTemperatura implements Sensor{
	private double temperatura;
	private boolean funcionando;
	private double limite;
	
	public SensorTemperatura(double temperatura, boolean funcionando, double limite) {
		this.funcionando = funcionando;
		this.temperatura = temperatura;	
		this.setLimite(limite);
	}

	public double getTemperatura() {
		return temperatura;
	}

	public boolean isFuncionando() {
		return funcionando;
	}
	
	private void setLimite(double limite) {
		if (limite > 0) {
			this.limite = limite;
		}
	}
	
	public double getLimite() {
		return limite;
	}
	
	@Override
	public void lerValor() {
		System.out.println("A temperatura atual é de: " + this.temperatura);		
	}
	
	@Override
	public void verificarFuncionamento() {
		if (this.funcionando){
			System.out.println("Esta funcionando normalmente");
		} else {
			System.out.println("Não está funcionado corretamente");
		}
	}
	
	@Override
	public String retornaTipo() {
		return "Sensor de temperatura";
	}
	
	@Override
	public void detectarLimite() {
		if(temperatura > limite * 2) {
			System.out.println("CRÍTICO!!! Temperatura ultrapassou 2x o limite");
		} else if(temperatura > limite * 1.5) {
			System.out.println("ALERTA! Temperatura ultrapassou muito o limite");
		} else if(temperatura > limite) {
			System.out.println("ATENÇÃO, temperatura ultrapassou o limite!");
		}
	}
	


}
