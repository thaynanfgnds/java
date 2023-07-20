package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1; // Conversão implícita
		System.out.println(a);
		
		float c = 4;
		byte d = (byte) c; // Conversão explícita (CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e;
		System.out.println(f); // Conversão explícita (CAST)
	}
}
