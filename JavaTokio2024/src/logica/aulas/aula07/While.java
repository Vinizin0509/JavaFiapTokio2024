package logica.aulas.aula07;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		/*
		int i = 5;
		
		while (i >= 0) {
			System.out.println("ola mundo" + i);
			i--;
			*/
		
		
		
		
		/*
		String jogar = "sim";
		
		Scanner sc = new Scanner(System.in);
		
		while (jogar.equals("sim")) {
			System.out.println("repete ou inicia o jogo");
			
			System.out.println("Deseja jogar novamente:?  ");
			jogar = sc.nextLine();
			
			*/
		
		
		
		//MODIFICADORES DE USO
		
		int i = 0;
		
	    while (i < 10) {
		i++; //i = 1
		
		if (i == 3 ) {
			continue;
		}
		if (i == 7) {
			break;
		}
		
		System.out.println("Produto " + i);
		
		
		}
	    System.out.println("FIM");
	}

}
