package logica.exercicios.aula06;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		/*Escreva um algoritmo que recebe dois números e um caractere (representando uma
				das operações matemáticas (+, -, *, /)
				▪ O programa deve calcular o valor final de acordo com a operação selecionada.
				▪ Ou seja, se a entrada for 5, 6 e *, então seu programa dever mostrar 30.

				▪ Dica: switch/case facilita as coisas.
				*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o primeiro numero: ");
		double numero1 = sc.nextDouble();

		System.out.println("digite o segundo numero: ");
		double numero2 = sc.nextDouble();

		System.out.println("digite um caractere de operacao matematica: [+,-,*,/]: ");
		char operacao = sc.next().charAt(0);
		
		System.out.println("o primeiro numero e: " + numero1);
		System.out.println("o segundo numero e: " + numero2);
		System.out.println("a operacao escolhida e: " + operacao);
	
		
		double resultado = 0;

		switch (operacao) {
		case '+':
			resultado = (numero1 + numero2);
			break;
		case '-':
			resultado = (numero1 - numero2);
			break;
		case '*':
			resultado = (numero1 * numero2);
			break;
		case '/':
			if (numero2 != 0) {
				
				resultado = numero1 / numero2;
			} else {
				System.out.println("nao e possivel dividir por 0");
			}	
			break;
		default: 
			System.err.println("operacao invalida");

		
		
		}
		System.out.println("resultado: " + resultado);

	}

}
