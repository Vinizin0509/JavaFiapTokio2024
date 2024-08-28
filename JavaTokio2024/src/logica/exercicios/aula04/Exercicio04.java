package logica.exercicios.aula04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite seu nome:");
		String nome = sc.nextLine();
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite sua idade");
		int idade = scan.nextInt();
		sc.close();
		scan.close();
		
		System.out.println("Olá," + nome + "Voce tem" + idade + "anos");
		
		
		
		
		
		

	}

}
