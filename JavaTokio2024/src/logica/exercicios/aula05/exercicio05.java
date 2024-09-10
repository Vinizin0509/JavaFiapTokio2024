package logica.exercicios.aula05;

import java.util.Scanner;

public class exercicio05 {

	
	Scanner scan = new Scanner (System.in);
//	System.out.println("Digite a primeira nota: ");
	double notaA = scan.nextDouble();

			
	Scanner scane = new Scanner (System.in);
//	System.out.println("Digite a segunda nota: ");
	double notaB = scan.nextDouble();
	
	double peso1 = 4;
	double peso2 = 6;
	
	
	double mediaPonderada = ((notaA * peso1) + (notaB * peso2)) / (peso1 + peso2);
	
	
 }

