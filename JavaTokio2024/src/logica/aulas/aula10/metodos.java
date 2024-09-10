package logica.aulas.aula10;

import java.util.Scanner;

public class metodos {
	
	//metodos sem terorno e sem parametros/argumentos
	
	
	// declaracao da funcao
	static void saudacao() {
		Scanner sc = new Scanner (System.in);
				
				System.out.println("Digite seu nome: ");
				String nome = sc.nextLine();
				
				System.out.println("seja bem vindo: " + nome);
	}
	
	
	public static void main(String[] args) {
		// chamada da função
		saudacao();
		
		System.out.println();
		
		
		
		

		
		
		
		
		

	}

}
