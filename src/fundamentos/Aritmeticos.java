package fundamentos;

public class Aritmeticos {

	public static void main(String[] args) {

		int soma = 24 + 3;
		System.out.println("O resultado da soma: " + soma);

		int subtracao = 80 - 50;
		System.out.println("O resultado da subtracão: " + subtracao);

		int multiplicacao = 100 * 6;
		System.out.println("O resultado da multiplicacao: " + multiplicacao);

		int divisao = 78 / 9;
		System.out.println("O resultado da divisão: " + divisao);

		int mod = 78 % 9;
		System.out.println("O resultado da resto(modulo) da divisao é: " + mod);
		
		System.out.println("");
		System.out.println("ATRIBUIÇÃO");
		int a = 10;
		int b = a;
		a = a + 1;
		System.out.println(a);
		System.out.println(b);
			
	}
}
