package br.com.plataformamonitoramentoespacial.model;

public class PropulsaoEletrica extends SistemaPropulsao {
private double porcentagemBateria; 
	
	public PropulsaoEletrica(String nome, double potencia, boolean ligado, double porcentagemBateria) {
		super(nome, potencia, ligado);
		this.setPorcentagemBateria(porcentagemBateria);
		
	}

	public double getPorcentagemBateria() {
		return porcentagemBateria;
	}

	private void setPorcentagemBateria(double porcentagemBateria) {
		if(porcentagemBateria >= 0 && porcentagemBateria <= 100) {
			this.porcentagemBateria = porcentagemBateria;
		}	
	}
	
	@Override
	public void acelerar() {
		if(this.getPorcentagemBateria() == 0) {
			System.out.println("Não há bateria suficiente para andar");
		} else {
			super.acelerar();
		}
	}
	
	@Override
	public void abastecer() {
		this.setPorcentagemBateria(100);
	}
	
	@Override
	public double calcularEmpuxo() {
		return this.getPotencia() * 1.5;
	}
	
	
	

}
