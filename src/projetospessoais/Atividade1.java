
package projetospessoais;

import java.util.Locale;
import java.util.Scanner;

public class Atividade1 {
    /*
     * Faça um programa que receba a idade e o salário de 10 pessoas e mostre:
     * Quantas pessoas têm mais de 50 anos. A média salarial das pessoas com idade
     * entre 20 e 30 anos.
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int contador50 = 0;
        int contador2030 = 0;
        double somaSalarios = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Informe a idade do %d funcionario: ", i);
            int idade = leitor.nextInt();

            System.out.printf("Informe o salario do %d funcionario: ", i);
            double sal = leitor.nextDouble();

            if (idade > 50) {
                contador50++;
            }

            if (idade >= 20 && idade <= 30) {
                somaSalarios += sal;
                contador2030++;
            }
        }

        System.out.println("Pessoas com mais de 50 anos: " + contador50);

        if (contador2030 > 0) {
            double mediaSalarial = somaSalarios / contador2030;
            System.out.printf("Media salarial entre 20 e 30 anos: %.2f%n",
                    mediaSalarial);
        } else {
            System.out.println("Nenhuma pessoa tem entre 20 e 30 anos.");
        }

        leitor.close();
    }
}
