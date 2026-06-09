package br.com.plataformamonitoramentoespacial.model;

public abstract class ComponenteEspacial {
	private int id;
	private String nome;
	private String status;
	private double temperatura;
	
	// Construtor
	public ComponenteEspacial(int id, String nome, String status, double temperatura) {
		this.id = id;
		this.setNome(nome);
		this.status = status;
		this.temperatura = temperatura; 
	}

	// Getters e Setters
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getStatus() {
		return status;
	}

	public double getTemperatura() {
		return temperatura;
	}

	private void setNome(String nome) {
		if (nome != null) {
			this.nome = nome;			
		}
	}
	
	// Méttodos Ligar e Desligar (concretos)
	
	public void ligar() {
		String condicao = "Ligado";
		this.status = condicao;
		System.out.println("Novo status: " + condicao);

	}
	
	public void desligar() {
		String condicao = "Desligado";
		this.status = condicao;
		System.out.println("Novo status: " + condicao);
	}
	
	// Método abstrato
	public abstract void exibirTipo();

}
