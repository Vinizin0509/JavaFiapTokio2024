package logica.aulas.aula09;

public class Matrizes {

	public static void main(String[] args) {
		
		
		// tabuleiro do jogo da velha
		
		char[][] tabuleiro = new char[3][3];
		
		tabuleiro[0][0] = 'X';
		tabuleiro [1][1] = 'O';
		tabuleiro[2][2] = 'X';
		
		System.out.println();
		
		//criando mais algumas matrizes
		
		int[][] matriz = new int [4][5];
		
		int linhas = matriz.length; //qtd de linhas
		System.out.println(linhas);
		
		int colunas = matriz[0].length; //qtd de colunas que eu tenho na linha 0
		System.out.println(colunas);
		
		int numero = 1;
		
		System.out.println();
		
		//for para incluir valores na matriz
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = numero;
				numero++;
			}
		}
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
				
}
}
	}