package fundamentos;

import java.util.Scanner;

public class TipoStringEguals {

	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
		
		//String s2 = entrada.next();  "ENTRADA.NEXT" automaticamente elimina todos os espaços em branco
		String s2 = entrada.nextLine();
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}
}
