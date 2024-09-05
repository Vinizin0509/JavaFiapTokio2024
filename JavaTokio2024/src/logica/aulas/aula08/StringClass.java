package logica.aulas.aula08;

public class StringClass {

	public static void main(String[] args) {
		
		
		String str = "FIAP Paulista";
		int tamanhoStr = str.length();
		
		System.out.println(tamanhoStr);
		
		System.out.println(str.charAt(6));
		
		
		
		for (int i = 0; i < 13; i++) {
			System.out.println(str.charAt(i));
		}

	}

}
