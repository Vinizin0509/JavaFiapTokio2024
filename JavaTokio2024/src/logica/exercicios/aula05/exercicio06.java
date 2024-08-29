package logica.exercicios.aula05;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	
	//peça 1 ---------------------------------------------------
	
	System.out.println("digite o nome da peca 1: ");
	String nomePeca1 = sc.nextLine();
	
	
	System.out.println("escolha a qtd de pecas 1: ");
	int qtdPecas1 = Integer.parseInt(sc.nextLine());
	
	
	System.out.println("valor unitario de cada peca 1: ");
	double valorPeca1 = Double.parseDouble(sc.nextLine());
	
	
	//peca2 ------------------------------------------
	
	System.out.println("digite o nome da peca2");
	String nomePeca2  = sc.nextLine();
	
	System.out.println("escolha a qtd de pecas 2");
	int qtdPecas2 = Integer.parseInt(sc.nextLine());
	
	System.out.println("valor unitario de cada peca 2 ");
	double valorPeca2 = Double.parseDouble(sc.nextLine());
	
	
	//calculos
	
	double valorPago1 = qtdPecas1 * valorPeca1;
	double valorPago2 = qtdPecas2 * valorPeca2;
	
	double valorTotal = valorPago1 + valorPago2;
	
	System.out.println();
	System.out.printf("valor a ser pago por %s: %.2f\n", nomePeca1, valorPago1);
	System.out.printf("valor a ser pago por %s: %.2f\n", nomePeca2, valorPago2);
	
	
	
	
	
	
		
	}

}
