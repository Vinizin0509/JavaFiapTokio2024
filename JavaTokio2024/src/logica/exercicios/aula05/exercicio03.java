package logica.exercicios.aula05;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Digite seu nome: ");
	String nome = scan.nextLine();
	
	System.out.println("Selecione o seu genero da seguinte forma");
	System.out.println("[M] - Masc");
	System.out.println("[F] - Masc");
	System.out.println("[O] - Outro");
	System.out.println("[N] - N responder");
	
	char genero; 
	System.out.println("Selecione seu genero: ");
	genero = scan.next().charAt(0);

	
	System.out.println("Ola " + nome + " voce escolheu a seguinte  opcao de genero: " + genero);

	
	
	

	}

}
