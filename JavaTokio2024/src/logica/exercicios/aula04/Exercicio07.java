package logica.exercicios.aula04;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		//exercicio 5 aula 5 
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite a primeira nota: ");
		double notaA = scan.nextDouble();

				
		System.out.println("Digite a segunda nota: ");
		double notaB = scan.nextDouble();
		
		double peso1 = 4;
		double peso2 = 6;
		
		
		double mediaPonderada = ((notaA * peso1) + (notaB * peso2)) / (peso1 + peso2);
		
		System.out.println("a media ponderada das notas é: " + mediaPonderada);
				
				
		
		
		
		
	}

}
