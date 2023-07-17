package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		// O valor double poder ser declarada em uma linha e depois inicializada em outra linha.
		// Como tambem pode ser declara e inicializada na mesma linha. 
		double a = 4.5;
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		  
		// Para iniciar uma variavel voce precisa declarar e iniciar.
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		// Dentro de uma variavel não é possivel definir valores diferente.
		// Por exemplo: var c = "Texto";
		// var = 4.5;
		// Esse codigo não sera executa pois já definir "var" como varialvel tipo string.

				
		
	}

}
