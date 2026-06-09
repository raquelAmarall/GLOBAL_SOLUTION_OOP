package br.com.plataformamonitoramentoespacial.main;

import java.util.Scanner;

import br.com.plataformamonitoramentoespacial.model.Antena;
import br.com.plataformamonitoramentoespacial.model.DadosMissao;
import br.com.plataformamonitoramentoespacial.model.PropulsaoEletrica;
import br.com.plataformamonitoramentoespacial.model.PropulsaoQuimica;
import br.com.plataformamonitoramentoespacial.model.SensorPressao;
import br.com.plataformamonitoramentoespacial.model.SensorRadiacao;
import br.com.plataformamonitoramentoespacial.model.SensorTemperatura;

public class SistemaMonitoramento {

	public static void main(String[] args) {
		// Essa linha serve para o sistema ler o que o usuário digitar
		// Scanner é o nome de uma classe dentro da biblioteca java.util
		// entrada é o nome da variável que utilizamos para armazenar o Scanner
		// O System.in indica que a entrada virá do teclado
		Scanner entrada = new Scanner(System.in);
		
		//Componentes
		Antena antena1 = new Antena(01, "Antena0101", "Desligada", 20, 500);
		//Sensores
		SensorPressao sensorPressao = new SensorPressao(800, true, 100);
		SensorRadiacao sensorRadiacao = new SensorRadiacao(6, true, 5);
		SensorTemperatura sensorTemperatura = new SensorTemperatura(75, true, 50);
		//Missão
		DadosMissao missao1 = new DadosMissao("23°26'22''", 1234, "Missão VANS", 40, "Terra -> Marte", 3);
		// Propulsão
		PropulsaoQuimica propulsaoQuimica = new PropulsaoQuimica("Motor Químico", 80, true, 50);
		PropulsaoEletrica propulsaoEletrica =  new PropulsaoEletrica("Motor Elétrico", 60, true, 70);
		
		int opcao;
		
		do {
			System.out.println("\nSistema Monitoramento Espacial");
			System.out.println("1 - Verificar Sensores");
			System.out.println("2 - Controlar Propulsão");
			System.out.println("3 - Gerenciar Dados das Missões");
			System.out.println("4 - Simular Alertas");
			System.out.println("5 - Exibir Status Completos");
			System.out.println("0 - Sair");
			
			opcao = entrada.nextInt(); // Vai ler números inteiros
			
			switch(opcao) {
				case 1:
					System.out.println("\nVerificar Sensores");

                    sensorTemperatura.lerValor();
                    sensorTemperatura.verificarFuncionamento();

                    sensorPressao.lerValor();
                    sensorPressao.verificarFuncionamento();

                    sensorRadiacao.lerValor();
                    sensorRadiacao.verificarFuncionamento();

					break;
				case 2:
					System.out.println("\nEmpuxos: ");

                    propulsaoQuimica.acelerar();
                    System.out.println("Empuxo químico: "+ propulsaoQuimica.calcularEmpuxo());

                    propulsaoEletrica.acelerar();
                    System.out.println("Empuxo elétrico: "+ propulsaoEletrica.calcularEmpuxo());
					break;
				case 3:
					System.out.println("\nDados das Missões");
                    System.out.println("Missão: " + missao1.getNome(1234));
                    System.out.println("Tripulantes: " + missao1.getNumeroTripulantes());
                    System.out.println("Trajetória: " + missao1.getTrajetoria(1234));
                    System.out.println("Coordenadas: " + missao1.getCoordenadas(1234));
                    System.out.println("Combustível: " + missao1.getNivelCombustivel()  + "%");
					break;
				case 4:
					System.out.println("\nAlertas dos Sensores:");
					sensorPressao.detectarLimite();
					sensorRadiacao.detectarLimite();
					sensorTemperatura.detectarLimite();					
					break;
				case 5:
					System.out.println("\nComponentes Espaciais Cadastrados:");
					System.out.println("Tipo do Componente");
					antena1.exibirTipo();
					System.out.println("ID: "+ antena1.getId() + " Nome do Componente: " + antena1.getNome() + " Status: " + antena1.getStatus() + " Temperatura: " + antena1.getTemperatura()+"°C" + " Alcance: "+ antena1.getAlcance() +"Km");
					System.out.println("Ligando antena");
					antena1.ligar();					
					break;
			}
		}while(opcao != 0);
		
		entrada.close(); // para de ler as entradas

	}

}
