package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite a distância total percorrida (km): ");
		double distancia = leitor.nextDouble();

		System.out.print("Digite a quantidade de combustível consumido (litros): ");
		double combustivel = leitor.nextDouble();

		double consumoMedio = distancia / combustivel;

		// S
		System.out.println("\n=== RELATÓRIO DE CONSUMO ===");
		System.out.printf("Distância percorrida: %.2f km%n", distancia);
		System.out.printf("Combustível consumido: %.2f L%n", combustivel);
		System.out.printf("Consumo médio: %.2f km/L%n", consumoMedio);

		if (consumoMedio > 12.0) {
			System.out.println("Classificação: Carro econômico");
		} else {
			System.out.println("Classificação: Carro não econômico");
		}

		leitor.close();
	}
}