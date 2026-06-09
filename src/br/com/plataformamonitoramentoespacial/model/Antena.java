package br.com.plataformamonitoramentoespacial.model;

public class Antena extends ComponenteEspacial {
	private double alcance;
	
	public Antena(int id, String nome, String status, double temperatura, double alcance) {
		super(id, nome, status, temperatura);
		this.setAlcance(alcance);
		
	}

	public double getAlcance() {
		return alcance;
	}

	private void setAlcance(double alcance) {
		if (alcance > 0) {
			this.alcance = alcance;
		}
	}
	
	
	@Override
	public void exibirTipo() {
		System.out.println("Antena");
	}
	
	
	
	
	
	
	

}
