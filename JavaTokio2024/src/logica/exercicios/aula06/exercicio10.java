package logica.exercicios.aula06;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		
		
		/*Faça um programa que recebe o salário de um colaborador e o reajuste segundo o
seguinte critério, baseado no salário atual:
▪ Salários até R$ 280,00 (incluindo): aumento de 20%.
▪ Salários entre R$ 280,00 e R$ 700,00: aumento de 15%.
▪ Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%.
▪ Salários de R$ 1500,00 em diante: aumento de 5%.

▪ Após o aumento ser realizado, informe na tela:
▪ O salário antes do reajuste.
▪ O percentual de aumento aplicado.
▪ O valor do aumento.
▪ O novo salário, após o aumento.
*/
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("digite o salario atual: ");
		double salarioAtual = sc.nextDouble();
		
		double reajuste;
		
		if (salarioAtual <= 280) {
			reajuste = 0.2;
		} else if (salarioAtual > 280 && salarioAtual <=700) {
			reajuste = 0.15;
		}else if (salarioAtual >700 && salarioAtual <=1500 ) {
			reajuste = 0.10;
		} else {
			reajuste = 0.05;
		}
		
		double valorAumento = salarioAtual * reajuste;
		
		double novoSalario = salarioAtual + valorAumento;
		
		System.out.println("salario antes do reajuste" + salarioAtual);
		System.out.println("percentual do aumento " + reajuste*100 + "%");
		System.out.println("valor do aumento" + valorAumento);
		System.out.println("novo salario com aumento" + novoSalario);
	}

}
