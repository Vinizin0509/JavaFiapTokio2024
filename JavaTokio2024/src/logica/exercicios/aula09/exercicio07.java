package logica.exercicios.aula09;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> listaNomes = new ArrayList<>();
		
		String resposta = "";
		
		while (true) {
			System.out.println("digite o nome da pessoa: [enter para finalizar]");
			resposta = sc.nextLine();
			
			if (!resposta.isEmpty()) {
				listaNomes.add(resposta);
			} else {
				break;
				
			}
		}
		
		for (int i = listaNomes.size() -1; i > 0; i--) {
			System.out.println(listaNomes.get(i));
			
			
			
		}
		
	}

}
