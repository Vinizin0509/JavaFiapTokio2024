package logica.aulas.aula07;

import java.util.Scanner;

public class atividade04 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		double notaA, notaB;
		
		do {
			System.out.println("digite a primeira nota: ");
			notaA = sc.nextDouble();
			
		} while ((notaA < 0 || notaA >10));
		
		do {
			System.out.println("digite a primeira nota: ");
			notaB = sc.nextDouble();
			
		} while (notaB < 0 || notaB >10);
		
		double media = (notaA + notaB) /2;
		System.out.println("A media e: " + media);
		
		

	}

}
