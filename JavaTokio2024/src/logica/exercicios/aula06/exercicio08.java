package logica.exercicios.aula06;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		
		/*Escrever um algoritmo para determinar o consumo médio de um automóvel sendo
		fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.

		▪ Dê sua resposta em km por litro de combustível (km/Litro)

		▪ Caso a autonomia do veículo esteja abaixo de 8 km/L, exiba a mensagem:
		▪ “Esse carro bebe hein!”
		▪ Senão, exiba a mensagem:
		▪ “Autonomia legal”*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a distancia percorrida pelo veiculo em L: ");
		int distancia = sc.nextInt();
		
		System.out.println("digite o total de combustivel gasto em km: ");
		int combustivel = sc.nextInt();
		
		double autonomia = (distancia / combustivel);
		
		if (autonomia < 8 ) {
			System.out.println("esse carro bebe hein!");
		}else {
			System.out.println("Autonomia legal");
		}
		
		
		
		
		
		
	}

}
