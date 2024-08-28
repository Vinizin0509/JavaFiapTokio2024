package logica.aulas.aula05;

import java.util.Scanner;

public class manipulacao {

	public static void main(String[] args) {
		
		
		double salario = 1416.30;
		String salarioStr = Double.toString(salario);
		
		System.out.println(salario + salario);
		System.out.println(salarioStr+salarioStr);
		
		
		System.out.println(" ");
		
		String idade = "25";
		int IdadeInteiro = Integer.parseInt(idade);
		
		System.out.println(IdadeInteiro);
		
		System.out.println(" ");
		
		// Instanciar o scanner
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o preco do produto");
		String preco = scanner.nextLine();
		
		
		float precofloat = Float.parseFloat(preco);
		System.out.println(preco+preco);
		System.out.println(precofloat + precofloat);
		
	}

}
