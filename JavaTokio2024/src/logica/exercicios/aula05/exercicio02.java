package logica.exercicios.aula05;

public class exercicio02 {

	public static void main(String[] args) {
		int inteiro = 3;
		System.out.println("o número inteiro escolhido foi: " + inteiro);
		String str = Integer.toString(inteiro);
		System.out.println("o número inteiro convertido para string é: ");
		
		
		float floa = 12;
		System.out.println("o número float escolhido foi: " + floa );
		String stri = Float.toString(floa);
		System.out.println("o número float convertido para String é");
		
		
		
		double doubli = 12.5;
		System.out.println("o número double escolhido foi: " + doubli );
		String strin = Double.toString(doubli);
		System.out.println("o número double convertido para String é: " + doubli);
		
		
		
		//ou
		
		int numInt = 2;
		float numFloat = 2.5f;
		double numDouble = 5.0;
		
		System.out.printf("%d $.2f %.2f \n" , numInt, numFloat, numDouble);
		
		String numIntString = Integer.toString(numInt);
		String numFloatStr = Float.toString(numFloat);
		String numDoubleStr = Double.toString(numDouble);
		
//		System.out.println("%s %s %s\"," numIntString, numFloat, numDouble))
	}

}
