package estrutura;

import java.util.Scanner;

public class ExemploFor02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int soma = 0;
		int quantidade = 0;
		for (int i = 1; i <= 10; i++) {
			// System.out.println("PRINTLN-informe o "+i+" valor:");
			// int valor = leitor.nextInt();
			
			System.out.printf("PRINTF-informe o %d valor:", i);
			int valor = leitor.nextInt();
			
			soma += valor;// soma = soma + valor;
			quantidade += 1;// quantidade = quantidade + 1;
		}
		// fora do for
		System.out.println("Soma a quantidade:" + soma);
		System.out.println("A quantidade de números digitados:" + quantidade);
		leitor.close();
	}
}


        