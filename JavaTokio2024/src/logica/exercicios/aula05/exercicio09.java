package logica.exercicios.aula05;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um numero (0-999)");
		int numero = sc.nextInt();
		
		System.out.println("");
		System.out.println("valor digitado " + numero);
		
		int centena = (numero / 100) * 100;
		System.out.println("centena " + centena);
		
		int restoCentena = numero - centena;
		int dezena = (restoCentena /10) * 10;
		System.out.println("Dezena" + dezena);
		
		int unidade = restoCentena - dezena;
		System.out.println("Unidade"  + unidade);
		
		
	}

}
