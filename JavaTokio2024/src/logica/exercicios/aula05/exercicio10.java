package logica.exercicios.aula05;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("digite quantos anos tu tens: ");
		int anos = sc.nextInt();
		
		System.out.println("digite qtd de meses: ");
		int meses = sc.nextInt();
		
		System.out.println("digite a qtd de dias: ");
		int dias = sc.nextInt();
		
		int qtdDias = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("qtd de dias vividos: " + qtdDias);
		

	}

}
