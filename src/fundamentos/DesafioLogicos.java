package fundamentos;
public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
	    boolean comprouTV50 = trabalho1 && trabalho2;
	    boolean comprouTV32 = trabalho1 ^ trabalho2;
	    boolean comprouSorvete = trabalho1 || trabalho2;
	     // Operador Unário
	    boolean maisSaudavel = !comprouSorvete;
	    
	    System.out.println("ComprouTV 50\"? " + comprouTV50); 
	    System.out.println("ComprouTV 30\"? " + comprouTV32); 
	    System.out.println("ComprouTV 30\"Sorvete " + comprouTV32); 
	    System.out.println("Mais saudável? " + maisSaudavel);
	    
		
	}

}
