package poo;


import java.util.Scanner;

public class ContaBancariaObj {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Thalita", 150.0);

        conta.exibirSaldo();
        conta.depositar(50.0);
        conta.sacar(20.0);

        ContaBancaria conta1 = new ContaBancaria("Samuel", 200.0);

        conta1.exibirSaldo();
        conta1.depositar(30.0);
        conta1.sacar(20.0);

        conta.transferir(conta1, 50.0);

        System.out.println("===== SALDOS APÓS TRANSFERÊNCIA =====");

        conta.exibirSaldo();
        conta1.exibirSaldo();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe nome Titular da conta:");
        String NomeTitular = leitor.nextLine();

        System.out.println("Informe o saldo inicial da conta:");
        double NovoSaldo = leitor.nextDouble();

        ContaBancaria contaC = new ContaBancaria(NomeTitular, NovoSaldo);

        contaC.exibirSaldo();

        leitor.close();
    }
}
