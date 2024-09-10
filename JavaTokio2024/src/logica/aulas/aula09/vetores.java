package logica.aulas.aula09;

public class vetores {

	public static void main(String[] args) {
		
		
		//lado esquerdo: declaração do vetor de num inteiros
		//lado direito: instanciamos o vetor com 10 posiçoes
		int[] vetorInteiros = new int[10];
		
		vetorInteiros[0] = 10; // coclocando o valor 10 na posição 0 do vetor
		vetorInteiros[1] = 1999; //coclocando o valor 1999 na posição 1 do vetor
		
		System.out.println("Valor inteiro na posicao 0:" + vetorInteiros[0]);
		
		int anoNascimento = vetorInteiros[1];
		System.out.println("Ano nascimento" + anoNascimento);
		
		//acessando a posição via variavel
		
		int posicao = 0;
		System.out.println(vetorInteiros[posicao]);
		
		//----------------------------------------------------------------------
		
		//declarando uma lista de frutas com 4 posicoes
		String[] listaFrutas = new String[4];
		
		listaFrutas[0] = "Morango";
		listaFrutas[1] = "Uva";
		listaFrutas[2] = "Pera";
		listaFrutas[3] = "Tomate";
		
		System.out.println();
		System.out.println("Fruta pos 1:" + listaFrutas[1]);
		
		//outro jeito de declarar listas!!!
		String[] listaFrutas2 = {"melancia", "abacaxi", "pitaia", "banana"};
		
		//listaFrutas2[0] = "Melancia"
		//listaFrutas2[1] = "Abacaxi"
		//listaFrutas[2] = "Pitaia"
		//listaFrutas[3] = "Banana"
		// listaFrutas2.lenght = 4 
		
		int qtdFrutas = listaFrutas2.length;
		System.out.println("Qtd de frutas " + qtdFrutas);
		
		// for indexado
		for (int i = 0; i < listaFrutas2.length; i++) {
			System.out.println(listaFrutas2[i]);
		}
		
		
		
		
		// criar uma lista de numeros
		
		int[] numeros = {16,24,29,33};
		
		// for each --> percorre a lista e acessa os valores das posiçoes
		
	
		System.out.println();
		
		for (int numero: numeros) {
			System.out.println(numero);
		}
		
		
		
		
		
		
				
		
	}

}
