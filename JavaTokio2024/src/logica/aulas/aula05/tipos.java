package logica.aulas.aula05;

import java.util.Scanner;

public class tipos {
	
	
	public static void main(String[]args) {
		
		float preco = 10.99f;
		float preco2 = (float) 12.90;
		
		
		
		System.out.println("float 1: " + preco);
		System.out.println("float 2: " + preco2);
		
		
		
		int precoInteiro = (int) 2.5;
		System.out.println("Inteiro " + precoInteiro);
		
		int numeroX = 6;
		double numeroXDouble = numeroX;
		System.out.println(numeroXDouble);
		
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("digite um numero ");
		int numeroInteiro = (int) scanner.nextDouble();
		System.out.println(numeroInteiro);
		
		
		
		Integer numInteiroClass = numeroInteiro;
		
		
		System.out.println(numeroInteiro);
		System.out.println(numInteiroClass.getClass());
		
	}

}
