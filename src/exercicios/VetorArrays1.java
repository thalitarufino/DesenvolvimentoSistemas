package exercicios;

import java.util.Scanner;

public class VetorArrays1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] vetor1 = new int[4];

        double soma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Informe o " + (i + 1) + " valor");
            vetor1[i] = leitor.nextInt();

            soma = soma + vetor1[i];
        }

        System.out.println("Soma dos valores digitados: " + soma);

        leitor.close();
    }

}
