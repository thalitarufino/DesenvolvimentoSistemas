package exercicios;

import java.util.Scanner;

public class VetorArrays2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		// Criamos APENAS UM vetor com 8 posicoes
		int[] vetor1 = new int[8];

		// Este for serve para receber os 8 numeros
		for (int i = 0; i < 8; i++) {

			// Pede um numero ao usuario
			System.out.println("Informe o " + (i + 1) + " valor:");

			// Guarda o numero digitado dentro do vetor
			// Exemplo: vetor1[0], vetor1[1], vetor1[2]...
			vetor1[i] = leitor.nextInt();
		}

		// O maior comeca sendo o primeiro numero do vetor
		int maior = vetor1[0];

		// O menor tambem comeca sendo o primeiro numero
		int menor = vetor1[0];

		// Este segundo for percorre os numeros ja guardados
		// Comecamos em 1 porque a posicao 0 ja foi usada
		for (int i = 1; i < 8; i++) {

			// Se o numero atual for maior que o maior,
			// atualizamos a variavel maior
			if (vetor1[i] > maior) {
				maior = vetor1[i];
			}

			// Se o numero atual for menor que o menor,
			// atualizamos a variavel menor
			if (vetor1[i] < menor) {
				menor = vetor1[i];
			}
		}

		// Mostra o maior numero encontrado
		System.out.println("Maior numero: " + maior);

		// Mostra o menor numero encontrado
		System.out.println("Menor numero: " + menor);

		// Fecha o Scanner
		leitor.close();
	}
}
