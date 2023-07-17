package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informaçães do funcionario
		
		// tipos numéricos inteiros 
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; //sempre que um determinado numero inteiro caber dentro do int diferencie com "L" 
		//assim o java saberar o tipo de numero que deseja
		
		// Tipos numéricos reais
		float salario = 11_445.44F; // Sempre diferencie um numero float com a letra F
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipos booleano
		boolean  estaDeFerias =  false; // true
		
		// Tipos caractere
		char status = 'a'; // Ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Números de viagens 
		System.out.println(numerosDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println( id + ": ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);	
		System.out.println("fim");
	}

}
