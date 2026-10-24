package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        int quantidadeProduto = 0;
        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;
        double lucroTotal = 0;

        System.out.println("Deseja cadastrar um produto? (1-sim | 2-nao)");
        int opcao = leitor.nextInt();

        while (opcao == 1) {
            leitor.nextLine(); // essa linha tira o bug

            System.out.println("Informe o nome do produto:");
            String nome = leitor.nextLine();

            System.out.print("Preço de custo do produto: ");
            double precoCusto = leitor.nextDouble();

            System.out.print("Preço de venda do produto: ");
            double precoVenda = leitor.nextDouble();

            double lucro = precoVenda - precoCusto;

            quantidadeProduto++;
            somaPrecoCusto += precoCusto;
            somaPrecoVenda += precoVenda;
            lucroTotal += lucro;

            System.out.println("\nDeseja cadastrar outro produto? (1-sim | 2-nao)");
            opcao = leitor.nextInt();

            System.out.println("Produto cadastrado: " + nome);
        }

        if (quantidadeProduto > 0) {
            // para n ter bug eu tenho que fazer a media dps do while
            double mediaPC = somaPrecoCusto / quantidadeProduto;
            double mediaPV = somaPrecoVenda / quantidadeProduto;

            System.out.println("-------------------------------------------------------------------------");
            System.out.println("|                                                                       |");
            System.out.printf("| Quantidade total de produtos cadastrados: %-27d |\n", quantidadeProduto);
            System.out.printf("| Média dos preços de custo: R$ %-39.2f |\n", mediaPC);
            System.out.printf("| Média dos preços de venda: R$ %-39.2f |\n", mediaPV);
            System.out.printf("| Valor total de lucro obtido: R$ %-37.2f |\n", lucroTotal);
            System.out.println("|                                                                       |");
            System.out.println("-------------------------------------------------------------------------");
        } else {
            System.out.println("\nNenhum produto foi cadastrado.");
        }

        leitor.close();
    }
}
