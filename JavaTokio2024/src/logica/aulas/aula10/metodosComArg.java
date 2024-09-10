package logica.aulas.aula10;

import java.util.Scanner;

public class metodosComArg {
	//função com parametro e sem retorno para exibir nome personalizado
	static void saudacaoComArgs(String nome) {
		System.out.println("seja bem vindo: " + nome);
		
		
		
	}
	// função com parametro e sem retorno para exibir uma soma
	static void somar(int n1, int n2) {
		System.out.println("soma: " + (n1 + n2));
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nomeDigitado = sc.nextLine();
		// chamando a função saudacaoComArgs e passando como parametro a string
		
		saudacaoComArgs(nomeDigitado);
		
		//chamando função de soma
		somar(2,3);
		
		
		
		
		
		
		

	}

}
