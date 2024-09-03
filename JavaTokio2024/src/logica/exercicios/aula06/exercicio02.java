package logica.exercicios.aula06;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		/*Faça um programa que peça dois números e imprima o maior deles, e informe caso
		eles sejam iguais.
		*/
		
		Scanner sc = new Scanner (System.in);
		System.out.println("insira um numero: ");
		double numero1 = sc.nextDouble();
		
		System.out.println("insira mais um numero: ");
		double numero2 = sc.nextDouble();
		
		if (numero1 > numero2) {
			System.out.println("o numero 1 é maior que o segundo");
		} else if (numero2 > numero1) {
			System.out.println("o numero 2 é maior que o primeiro");
		} else if (numero1 == numero2) {
			System.out.println("os numeros são iguais");
		}
		
	}

}
