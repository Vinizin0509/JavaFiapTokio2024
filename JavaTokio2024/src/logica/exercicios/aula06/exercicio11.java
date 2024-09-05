package logica.exercicios.aula06;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("origem da carga (1-5");
		int estado = sc.nextInt();
		
		
		System.out.println("digite o peso do caminhao em toneladas");
		double pesoToneladas = sc.nextDouble();
		
		System.out.println("codigo da carga (10-40");
		int codCarga = sc.nextInt();
		
		//COMEÇAR A REALIZAR OS CALCULOS
		
		//CONVERTENDO TONELADAS PARA KG
		double pesokg = pesoToneladas * 1000.;
		
		double precoPorKg = 0;
		
		if (codCarga >= 10 && codCarga <=20) {
			precoPorKg = 100;
		} else if (codCarga <= 30) {
			precoPorKg = 250;
		} else if (codCarga <= 40) {
			precoPorKg = 340;
		}
	
		//estou verificando qual sera a porcentagem do imposto
		//de acordo com o estado de origem
		double impostoPorcentagem = 0;
		
		if (estado ==1) {
			impostoPorcentagem = 0.35;
		}else if (estado ==2) {
			impostoPorcentagem = 0.25;
		}else if (estado ==3) {
			impostoPorcentagem = 0.15;
		}else if (estado ==4) {
			impostoPorcentagem = 0.05;
		}else if (estado ==5) {
			impostoPorcentagem = 0;
			
			// Calcular o preço da carga
			double precoCarga = pesokg * precoPorKg; //1000 * 340
			
			//calcular o valor do imposto
			double imposto = precoCarga * impostoPorcentagem; //340.000 * 0.05
			
			
			//calculando o valor final precoCarga + imposto
			double valorFinal = precoCarga + imposto;
			
			System.out.println("Peso da carga em kg: " + pesokg);
			System.out.println("preco da carga: " + precoCarga);
			System.out.println("valor do imposto: " + imposto);
			System.out.println("valor final: " + valorFinal);
			
			
			
			
			
			
			
		}
		
		
			
		
		
	
		
		

	}

}
