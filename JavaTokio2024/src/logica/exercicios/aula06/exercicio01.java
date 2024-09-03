package logica.exercicios.aula06;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		//Faça um programa que leia um número, e informe se ele é par ou impar.
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("informe um numero");
		double numero = sc.nextDouble();
		
		boolean verificaNumero = (numero % 2 == 0);
		System.out.println("o numero escolhido e par? " + verificaNumero);
		
	}

}
