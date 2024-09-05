package logica.exercicios.aula06;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		
		/*Faça um algoritmo que calcule o valor da conta de luz de uma pessoa, empresa etc.
▪ Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
	Tipo cliente Valor do KW/h
	1 (residência) 0,60
	2 (comércio) 0,48
	3 (indústria) 1,29 
	*/
		

		Scanner sc = new Scanner(System.in);
		System.out.println("digite o tipo de imovel");
		String tipoImovel = sc.nextLine();
		
		System.out.println("digite a quantidade de horas utilizadas com energia");
		int horasEnergia = sc.nextInt();
		
		
		double resultado = 0;
		
		switch  (tipoImovel) {
			case "residencia":
				resultado = (horasEnergia * 0.60);
				break;
			case "comercio":
				resultado = (horasEnergia * 0.48);
				break;
			case "industria":
				resultado = (horasEnergia * 1.29);
				break;
				
				
		}
				
			System.out.println("voce devera pagar: R$:" + resultado);
			
		
		
		
		
		
	}
	}


