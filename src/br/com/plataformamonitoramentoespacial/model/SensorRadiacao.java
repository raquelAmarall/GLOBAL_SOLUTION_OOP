package br.com.plataformamonitoramentoespacial.model;

public class SensorRadiacao implements Sensor {
	private double radiacao;
	private boolean funcionando;
	private double limite;
	
	
	public SensorRadiacao(double radiacao, boolean funcionando, double limite) {
		this.funcionando = funcionando;
		this.radiacao = radiacao;	
		this.setLimite(limite);
	}

	public double getRadiacao() {
		return radiacao;
	}

	public boolean isfuncionando() {
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
		System.out.println("A radiacao atual é de: " + this.radiacao);		
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
		return "Sensor de radiação";
	}
	
	@Override
	public void detectarLimite() {
		if(radiacao > limite * 2) {
			System.out.println("CRÍTICO!!! Radiação ultrapassou 2x o limite");
		} else if(radiacao > limite * 1.5) {
			System.out.println("ALERTA! Radiação ultrapassou muito o limite");
		} else if(radiacao > limite) {
			System.out.println("ATENÇÃO, radiação ultrapassou o limite!");
		}
	}
	
	


}
