
package projetospessoais;

import java.util.Scanner;
import java.util.Locale;

public class Atividade4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do operador do caixa: ");
        String nome = leitor.nextLine();

        System.out.print("Informe o valor do saldo inicial do caixa (R$): ");
        double saldoInical = leitor.nextDouble();

        int opcao = -1;
        int totalcarro = 0;
        int totalmoto = 0;
        double saldoTotal = 0;
        int qntMaxima = 0;
        double media = 0;

        while (opcao != 0) {

            System.out.println("1 - Registrar Cobrança de Veículo\n"
                    + "2 - Pesquisa de Satisfação (3 Clientes)\n"
                    + "3 - Ver Saldo do Caixa\n"
                    + "0 - Fechar Caixa e Encerrar\n");

            opcao = leitor.nextInt();

            switch (opcao) {

            case 1:
                System.out.println("---REGISTRAR COBRANÇA---");
                System.out.println("Informe o Tipo de Veículo:\n"
                        + "1 para Carro (R$ 10,00/hora)\n"
                        + "2 para Moto (R$ 5,00/hora).\n");

                int tipoDeVeiculo = leitor.nextInt();

                System.out.println("Informe a quantidade de horas que o veículo permaneceu no estacionamento:");
                int horas = leitor.nextInt();

                // se senao para saber qual é o tipo do veículo
                if (tipoDeVeiculo == 1) {
                    totalcarro = horas * 10;
                    saldoTotal = saldoTotal + totalcarro;

                } else if (tipoDeVeiculo == 2) {
                    totalmoto = horas * 5;
                    saldoTotal = saldoTotal + totalmoto;

                } else {
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
                }

                // se senao para aplicar o desconto
                if (tipoDeVeiculo == 1 && horas >= 4) {
                    double desconto = totalcarro * 0.10;
                    saldoTotal = saldoTotal - desconto;

                    System.out.println("DESCONTO DE 10% APLICADO COM SUCESSO!!!");
                    System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
                }

                System.out.printf("Valor da cobrança: R$ %.2f%n",
                        tipoDeVeiculo == 1
                                ? totalcarro - (horas >= 4 ? totalcarro * 0.10 : 0)
                                : totalmoto);

                break;

            case 2:
                System.out.println("---Pesquisa de Satisfação---");
                int somaNotas = 0;
                int clientesValidos = 0;
                int notasMaximas = 0;

                for (int i = 1; i <= 3; i++) {
                    System.out.println("Pesquisa de satisfação para o " + i + " cliente");
                    System.out.println("Como você avalia nosso atendimento?");
                    System.out.println("1 - Muito ruim");
                    System.out.println("2 - Ruim");
                    System.out.println("3 - Regular");
                    System.out.println("4 - Bom");
                    System.out.println("5 - Excelente");

                    int opcaoSatisfacao = leitor.nextInt();

                    if (opcaoSatisfacao >= 1 && opcaoSatisfacao <= 5) {

                        somaNotas = somaNotas + opcaoSatisfacao;
                        clientesValidos++;

                        if (opcaoSatisfacao == 1 || opcaoSatisfacao == 2) {
                            System.out.println("Sentimos muito! Vamos melhorar.");

                        } else if (opcaoSatisfacao == 3) {
                            System.out.println("Obrigado! Vamos buscar melhorar.");

                        } else if (opcaoSatisfacao == 4) {
                            System.out.println("Que bom! Agradecemos sua avaliação.");

                        } else if (opcaoSatisfacao == 5) {
                            System.out.println("Que bom! Agradecemos sua avaliação.");
                            qntMaxima++;
                            notasMaximas++;
                        }

                    } else {
                        System.out.println("Opção inválida! Digite um número de 1 a 5.");
                        i--;
                    }
                }

                if (clientesValidos > 0) {
                    media = (double) somaNotas / clientesValidos;
                }

                System.out.printf("Média de satisfação: %.2f%n", media);
                System.out.println("Quantidade de notas máximas nesta pesquisa: " + notasMaximas);
                System.out.println("Quantidade total de notas máximas: " + qntMaxima);

                break;

            case 3:
                System.out.println("---CONSULTAR SALDO---");
                System.out.printf("Saldo inicial: R$ %.2f%n", saldoInical);
                System.out.printf("Faturamento: R$ %.2f%n", saldoTotal);
                System.out.printf("Saldo atual do caixa: R$ %.2f%n",
                        saldoInical + saldoTotal);
                break;

            case 0:
                System.out.println("---FECHAR CAIXA---");
                System.out.println("Nome do operador: " + nome);
                System.out.printf("Saldo inicial: R$ %.2f%n", saldoInical);
                System.out.printf("Faturamento: R$ %.2f%n", saldoTotal);
                System.out.printf("Saldo final do caixa: R$ %.2f%n",
                        saldoInical + saldoTotal);
                System.out.println("Caixa encerrado!");

                break;

            default:
                System.out.println("Opção inválida! Digite uma opção do menu.");
            }
        }

        leitor.close();
    }
}
