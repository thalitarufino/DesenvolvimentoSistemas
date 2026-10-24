package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		System.out.println("=== KIKO LANCHES ===");

		System.out.println("Escolha o seu lanche:\n" 
				+ "X-SALADA – pagar R$ 8,00\n" 
				+ "X-TUDO – pagar R$ 12,00\n"
				+ "X-EGGDUPLO – pagar R$ 10,00\n" 
				+ "X-BACON – pagar R$ 11,00");

		String opcao = leitor.nextLine();

		switch (opcao.toUpperCase()) {

		case "X-SALADA":
			System.out.println("O total a pagar é: R$ 8,00");
			break;

		case "X-TUDO":
			System.out.println("O total a pagar é: R$ 12,00");
			break;

		case "X-EGGDUPLO":
			System.out.println("O total a pagar é: R$ 10,00");
			break;

		case "X-BACON":
			System.out.println("O total a pagar é: R$ 11,00");
			break;

		default: 
			System.out.println("Opção de lanche inválida!");	
			break;	
		}

		leitor.close();
	}
}