package br.com.plataformamonitoramentoespacial.model;

public class DadosMissao {
	private String coordenadas;
	private static final int CODIGO_ACESSO = 1234; 
	private String nome;
	private double nivelCombustivel; // porcentagem
	private String trajetoria;
	private int numeroTripulantes;
	
	public DadosMissao(String coordenadas, int codigoAcesso, String nome, double nivelCombustivel, String trajetoria, int numeroTripulantes) {
		this.setCoordenadas(coordenadas, codigoAcesso);
		this.setNome(nome, codigoAcesso);	
		this.setNivelCombustivel(nivelCombustivel);
		this.setTrajetoria(trajetoria, codigoAcesso);
		this.setNumeroTripulantes(numeroTripulantes);
	}

	public String getCoordenadas(int codigoAcesso) {
		if (codigoAcesso == CODIGO_ACESSO) {
			return coordenadas;
		} else {
			 return "O código de acesso não está correto, coordenadas não podem ser acessadas";
		}
	}

	private void setCoordenadas(String coordenadas, int codigoAcesso) {
		if (codigoAcesso == CODIGO_ACESSO && coordenadas != null) {
			this.coordenadas = coordenadas;
		}else {
			this.coordenadas = "";
			System.out.println("Código não fornecido corretamente coordenadas não indicadas");
		}
	}

	public String getNome(int codigoAcesso) {
		if (codigoAcesso == CODIGO_ACESSO) {
			return nome;
		} else {
			 return "O código de acesso não está correto, nome não pode ser acessado";
		}
	}

	private void setNome(String nome, int codigoAcesso) {
		if (codigoAcesso == CODIGO_ACESSO && nome != null) {
			this.nome = nome;
		}else {
			this.nome = "";
			System.out.println("Código não fornecido corretamente nome não indicado");
		}
	}
	
	
	public double getNivelCombustivel() {
	    return nivelCombustivel;
	}
	
	private void setNivelCombustivel(double nivelCombustivel) {
	    if (nivelCombustivel >= 0 && nivelCombustivel <= 100) {
	        this.nivelCombustivel = nivelCombustivel;
	        
	        if (nivelCombustivel < 20) {
	            System.out.println("ALERTA: combustível abaixo de 20%");
		    }
	    } 
	   
	}
	
	private void setTrajetoria(String trajetoria, int codigoAcesso) {
		if (codigoAcesso == CODIGO_ACESSO && trajetoria != null) {
			this.trajetoria = trajetoria;
		}else {
			this.trajetoria = "";
			System.out.println("Código não fornecido corretamente trajetória não indicada");
		}
	}
	
	public String getTrajetoria(int codigoAcesso) {
		if (codigoAcesso == CODIGO_ACESSO) {
			return trajetoria;
		} else {
			 return "O código de acesso não está correto, trajetória não pode ser acessada";
		}
	}
	
	private void setNumeroTripulantes(int numeroTripulantes) {
	    if (numeroTripulantes >= 0) {
	        this.numeroTripulantes = numeroTripulantes;
	    }
	}
	
	public int getNumeroTripulantes() {
		return numeroTripulantes;
	}
	
	
	

}
