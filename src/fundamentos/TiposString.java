package fundamentos;

public class TiposString {
	
	public static void main(String[] args) {
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		 
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: "
		             + sobrenome + "\nIdade: " + idade + 
		             "\nSalario: " + salario + "\n\n");
		
	    System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.",  nome, sobrenome, idade, salario);   
	    
	    String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f.",  nome, sobrenome, idade, salario);
	    System.out.println(frase);
		
	    // Tambem posso criar: 
	    
	    String maisumafrase = "\nNome: " + nome + "\nSobrenome: "
	             + sobrenome + "\nIdade: " + idade + 
	             "\nSalario: " + salario + "\n\n";
	    System.out.println(maisumafrase);
	}

}
