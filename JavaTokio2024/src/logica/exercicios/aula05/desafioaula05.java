package logica.exercicios.aula05;

import java.util.Scanner;

public class desafioaula05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("digite sua idade em dias vividos");
		int idadeEmDias = sc.nextInt();
		
		
		//9255 dias
		//25 anos
		//4 meses
		// 10 dias

		int anos = idadeEmDias / 365;
		System.out.println("idade em anos" + anos);
		int restoDeAno = idadeEmDias % 365;
		System.out.println("exibindo o resto " + restoDeAno);
		
		int meses = restoDeAno / 30; //130 dividido por 30
		System.out.println("Meses" + meses);
		
		int dias = restoDeAno % 30; //resto da divisao de 130 por 30 
		System.out.println("Dias" + dias);
	}

}
