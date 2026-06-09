package br.com.plataformamonitoramentoespacial.model;

public class SensorPressao implements Sensor {
	private double pressao;
	private boolean funcionando;
	private double limite;
	
	public SensorPressao(double pressao, boolean funcionando, double limite) {
		this.funcionando = funcionando;
		this.pressao = pressao;		
		this.setLimite(limite);
	}

	public double getPressao() {
		return pressao;
	}

	public boolean getfuncionando() {
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
		System.out.println("A pressão atual é de: " + this.pressao);		
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
		return "Sensor de pressão";
	}
	
	@Override
	public void detectarLimite() {
		if(pressao > limite * 2) {
			System.out.println("CRÍTICO!!! Pressão ultrapassou 2x o limite");
		} else if(pressao > limite * 1.5) {
			System.out.println("ALERTA! Pressão ultrapassou muito o limite");
		} else if(pressao > limite) {
			System.out.println("ATENÇÃO, pressão ultrapassou o limite!");
		}
	}
	


}
