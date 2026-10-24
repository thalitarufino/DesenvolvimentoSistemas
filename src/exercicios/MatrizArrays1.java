package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MatrizArrays1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int[][] matriz1 = new int[3][3];

        // 1. Leitura: laços ajustados para iniciar em 0 até menores que 3 (0, 1, 2)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Exibe (i+1) e (j+1) apenas visualmente para o usuário
                System.out.print("Digite o valor [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz1[i][j] = leitor.nextInt();
            }
        }

        // 2. Impressão da matriz inteira após a inserção do último valor
        System.out.println("\n--- Matriz Resultante ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println(); // Quebra de linha ao final de cada fileira
        }

        leitor.close();
    }
}