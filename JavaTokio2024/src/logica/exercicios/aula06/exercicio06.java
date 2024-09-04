package logica.exercicios.aula06;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
		/*Faça um programa que receba o ano de nascimento da pessoa e retorne:
		▪ Se o voto é obrigatório este ano;
		▪ Se o voto é opcional este ano;
		▪ Se o voto é proibido este ano.*/

		
		Scanner sc = new Scanner(System.in);
		System.out.println("qual o ano do seu nascimento?: ");
		int anonascimento = sc.nextInt();
		int calculoidade = (2024 - anonascimento);
		
		
		if ((calculoidade >= 18 && calculoidade <=70)) {
			System.out.println("seu voto e obrigatorio");
			} else if ((calculoidade >=16 && calculoidade< 18 || calculoidade > 70 )) {
				System.out.println("seu voto e opcional ");
			} else {
				System.out.println("seu voto é proibido");
			}
		
		
	}

}
