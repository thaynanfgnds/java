package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// ( °F - 32) X 5/9 = °C)
		
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		 
		double fahrenheite = 86;
		double celsius = (fahrenheite - AJUSTE ) * FATOR;
		System.out.println("O resultado é " + celsius + "°C.");
		
		fahrenheite = 150;
		celsius = (fahrenheite - AJUSTE ) * FATOR;
		System.out.println("O resultado é " + celsius + "°C.");
		
		
		
	}

}
