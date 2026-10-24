package fundamentos;

public class Unitarios2 {
	public static void main(String[] args) {

		/*
		 * ++a pré-incremento **AUMENTA ANTES USAR a++ pós-incremento **USA O VALOR DA
		 * VARIAVEL ANTES, AUMENTA DEPOIS --a pré-Decremento **DIMINUI ANTES USAR a--
		 * pós-Decremento **USA O VALOR DA VARIAVEL ANTES, DIMINUI DEPOIS
		 */

		int n1 = 2;
		int n2 = 4;
		int n3 = 6;

		System.out.println(n1++ + --n2);
		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);
		System.out.println("n3:" + n3);
	}
}