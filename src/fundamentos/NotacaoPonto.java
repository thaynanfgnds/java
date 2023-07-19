package fundamentos;

public class NotacaoPonto { 
	
	public static void main(String[] args) {
		
		String s = "Bom dia x";
		s = s.replace("x", "senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
        // Posso tambem executar a mesma sentença de codigos na mesma linha. 
		
		String y = "Bom dia x" 
				.replace("x", "Gui")
				.toUpperCase()
				.concat("!!!!");
		System.out.println(y);
		 
		// Tipo primitivos não tem operador "."
		
		 int a = 3;
		 //a. 
		 System.out.println(a);
	}

}
