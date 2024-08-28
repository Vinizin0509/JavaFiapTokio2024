package logica.aulas.aula05;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		// LOGICA E (&&)
		//EMAIL		SENHA	LOGIN
		//TRUE		TRUE	TRUE
		//TRUE		FALSE	FALSE
		//FALSE		TRUE	FALSE
		//FALSE		FALSE	FALSE
		
		boolean verificaEmail = true;
		boolean verificaSenha = true;
		
		boolean logicaE = verificaEmail && verificaSenha;
		System.out.println(logicaE);
		
		
		//LOGICA OU (II)
		//SOL NO DOM	JOGO BR		CHURRASCO NO DOM		
		//TRUE			TRUE		TRUE
		//TRUE			FALSE		TRUE
		//FALSE			TRUE		TRUE
		//FALSE			FALSE		FALSE
		
		boolean logicaOU = false || false;
		System.out.println(logicaOU);
		
		//OPERAÇÃO DE NEGAÇÃO
		
		boolean negacao =!false;
		System.out.println(negacao);
		
	}

}
