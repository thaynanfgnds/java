package fundamentos;

public class ConversaoNumericoString {
	
	public static void main(String[] args) {
		Integer num1 = 1000;
		System.out.println(num1.toString().length());

		int num2 = 10000;
		System.out.println(Integer.toString(num2).length());

		// Também pode-se converter concatenando com string vazia.
		System.out.println("" + num1);
		System.out.println("" + num2);
	}

}
