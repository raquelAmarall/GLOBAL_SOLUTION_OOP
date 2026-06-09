package br.com.plataformamonitoramentoespacial.model;

public class PropulsaoQuimica extends SistemaPropulsao{
	private double porcentagemCombustivel; 
	
	public PropulsaoQuimica(String nome, double potencia, boolean ligado, double porcentagemCombustivel) {
		super(nome, potencia, ligado);
		this.setPorcentagemCombustivel(porcentagemCombustivel);
	}

	public double getPorcentagemCombustivel() {
		return porcentagemCombustivel;
	}

	private void setPorcentagemCombustivel(double porcentagemCombustivel) {
		if(porcentagemCombustivel >= 0 && porcentagemCombustivel <= 100) {
			this.porcentagemCombustivel = porcentagemCombustivel;
		}	
	}
	
	@Override
	public void acelerar() {
		if(this.getPorcentagemCombustivel() == 0) {
			System.out.println("Não há combustível suficiente para andar");
		} else {
			super.acelerar();
		}
	}
	
	@Override
	public void abastecer() {
		this.setPorcentagemCombustivel(100);
	}
	
	@Override
	public double calcularEmpuxo() {
		return this.getPotencia() * 2;
	}
	
	

}
