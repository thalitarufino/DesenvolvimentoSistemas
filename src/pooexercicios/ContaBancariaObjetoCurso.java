package pooexercicios;

import java.util.Scanner;

public class ContaBancariaObjetoCurso {
	public static void main(String[] args) {

		ContaBancariaCurso conta = new ContaBancariaCurso("Thalita", 500);

		conta.exibirSaldo();
		conta.depositar(150);
		conta.sacar(150);
		conta.exibirSaldo();

		ContaBancariaCurso conta1 = new ContaBancariaCurso("Samuel", 250);

		conta1.exibirSaldo();
		conta1.depositar(250);
		conta1.sacar(250);
		conta1.exibirSaldo();

		// Transferência da Thalita para Samuel
		conta.transferir(conta1, 25);

		// Exibir os saldos depois da transferência
		System.out.println("===== SALDOS APÓS TRANSFERÊNCIA =====");
		conta.exibirSaldo();
		conta1.exibirSaldo();

		// OBJETO = com Scanner e Construtor
		String NomeTitular;
		double NovoSaldo;

		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe nome Titular da conta:");
		NomeTitular = leitor.nextLine();
		System.out.println("Informe o saldo inicial da conta:");
		NovoSaldo = leitor.nextInt();

		ContaBancariaCurso contaC = new ContaBancariaCurso(NomeTitular, NovoSaldo);
		contaC.exibirSaldo();
		leitor.close();
	}
}
