package logica.exercicios.aula07;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		
		/*▪ Faça um programa que exiba a mensagem “Olá, Mundo”.
		▪ Essa mensagem deverá ser exibida repetidamente.
		▪ Ao final de toda iteração da repetição, você deve perguntar ao usuário se ele deseja
		exibir a mensagem novamente.
		▪ Se sim, exiba novamente. Senão, saia do loop e exiba a mensagem “Fim”.
		
		String jogar = "sim";
		
		Scanner sc = new Scanner(System.in);
		
		while (jogar.equals("sim")) {
			System.out.println("repete ou inicia o jogo");
			
			System.out.println("Deseja jogar novamente:?  ");
			jogar = sc.nextLine();
			
		*/
		
        String mesage = "sim";
 		
		Scanner sc = new Scanner(System.in);
		
		while (mesage.equals("sim")) {
			System.out.println("hello world");
			
			System.out.println("Deseja exibir novamente?  ");
			mesage = sc.nextLine();
	
	}

}
}
