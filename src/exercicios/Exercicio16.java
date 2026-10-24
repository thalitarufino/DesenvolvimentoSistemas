package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio16 {

    /*
     * Faça um Programa que receba a idade, a altura e o peso de 15 pessoas.
     * Calcule e imprima:
     * • a quantidade de pessoas com idade superior a 50 anos;
     * • a média das alturas das pessoas com idade entre 10 e 20 anos;
     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int idade50 = 0;
        int quantidadePessoas = 0;
        double somaAlturas = 0;

        for (int i = 1; i <= 15; i++) {

            System.out.println("===== Pessoa " + i + " =====");

            System.out.print("Informe a sua idade: ");
            int idade = leitor.nextInt();

            System.out.print("Informe a sua altura: ");
            double alt = leitor.nextDouble();
            if (idade > 50) {
                idade50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturas += alt;
                quantidadePessoas++;
            }
        }

        System.out.println();
        System.out.println("========== RESULTADOS ==========");

        System.out.println(
            "Quantidade de pessoas com idade superior a 50 anos: " + idade50
        );

        if (quantidadePessoas > 0) {

            double mediaAltura = somaAlturas / quantidadePessoas;

            System.out.printf(
                "Média de altura das pessoas entre 10 e 20 anos: %.2f metros%n",
                mediaAltura
            );

        } else {

            System.out.println(
                "Nenhuma pessoa com idade entre 10 e 20 anos foi cadastrada."
            );
        }

        leitor.close();
    }
}