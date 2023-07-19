package fundamentos;

public class Wrappers {

	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; // Classe primitiva "int"
		// Integer i = Integer.parseInt("10000");. Conversao de uma string para um valor
		// inteiro
		Long l = 1000000L; // Sempre definir a variavel long com "L"

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);

		Float f = 123.10F; // obrigatoriamente coloca-se "f" no final para a conversão de um int para o
						// float ou double.
		
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
	}

}
