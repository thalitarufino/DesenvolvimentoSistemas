package fundamentos;

public class Atribuicao2 {
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//c = a + b;
		//C vale 6
		//forma simplificada
		//fazer separado um de cada vez
		
	
		//c +=b; // c = c + b; atribuição aditiva
		//System.out.println("\nSoma c +=b:"+c);//9
		
		//c -= a; // c = c - a; atribuição substrativa
		//System.out.println("\nSubratracao c -=b:"+c);
		
		//c *= b; // c = c * b; atribuição mutiplicativa
		//System.out.println("\nMultiplicação c *=b:"+c);
		c /= a; // c = c / a; atribuição divisiva
		
		System.out.println("\nDivisão c/=b:"+c);
		c %= 2;// c = c % 2; 0 ou 1 par ou ímpa atribuição modular
		
		int g;
		g=a;
		System.out.println("G" +g);
		g+=1;
		System.out.println("G" +g);
}
}