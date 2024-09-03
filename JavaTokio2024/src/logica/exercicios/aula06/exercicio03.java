package logica.exercicios.aula06;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		/*Faça um programa para a leitura de quatro notas parciais de um aluno. O programa
		deve calcular a média alcançada pelo aluno e apresentar:
			▪ A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
			▪ A mensagem "Em recuperação", se a média for entre cinco, incluindo o cinco, e sete;
			▪ A mensagem "Reprovado", se a média for menor que cinco.
*/
		
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("digite a primeira nota: ");
		double nota1 = sc.nextDouble(); 
		
		System.out.println("digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("digite a terceira nota: ");
		double nota3 = sc.nextDouble();
		
		System.out.println("digite a quarta nota: ");
		double nota4 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 2;
		
		if (media >= 7) {
			System.out.println("Aprovado");
		}else if ((media >5 && media <=7)) {
			System.out.println("Em recuperação");
		}else if (media < 5) {
			System.out.println("Reprovado");
		}
		
	}

}
