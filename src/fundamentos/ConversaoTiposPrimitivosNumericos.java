package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
	
		//Double para float
		
		double a = 5;  //implícita e o java não se preocupa com o valor
		System.out.println("a (double): "+a);  // vai sair 1.0 no console
		
		//Explícita, precisa converter para float - usar float para otimizar espaço no armazenamento
		
		float b = (float) 1.89; //converter com (float) 1.89
		System.out.println("b (float): "+b);
		
		float b1 = 1.89f; //converter com f - 1.89f
		System.out.println("b1 (float-1.89f): "+b1);
		
		//int para byte
		
		int c = 126;
		byte d = (byte) c; //explícita
		System.out.println("d (int para byte): "+d);
		
		double e = 1.6; // o java não se preocupa com o valor
		int f = (int) e;
		System.out.println("f (double para int): "+f);
		

	}

}
