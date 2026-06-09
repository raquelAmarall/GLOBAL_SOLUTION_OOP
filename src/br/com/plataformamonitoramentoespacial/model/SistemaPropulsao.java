package br.com.plataformamonitoramentoespacial.model;

public abstract class SistemaPropulsao {
	private String nome;
	private double potencia;
	private boolean ligado;
	
	public SistemaPropulsao(String nome, double potencia, boolean ligado) {
		this.nome = nome;
		this.setPotencia(potencia);
		this.ligado = ligado;
	}

	public double getPotencia() {
		return potencia;
	}

	private void setPotencia(double potencia) {
	    if (potencia >= 0 && potencia <= 100) {
	        this.potencia = potencia;
	    }
	}
	
	public String getNome() {
		return nome;
	}
	

	public boolean isLigado() {
		return ligado;
	}
	
	public void acelerar(){
		if (!ligado) {
			System.out.println("Motor desligado, não é possível acelerar");
		} else {
			System.out.println("Acelerando com "+ this.potencia + "% de potência.");

		}
	}
	
	public abstract void abastecer();
	
	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado = false;
	}
	
	public abstract double calcularEmpuxo();
	
	
	
}
