package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		System.out.println("Selecione o Turno: [1] Manhã | [2] Tarde | [3] Noite");
		int opcao = leitor.nextInt();

		switch (opcao) { // escolha

		case 1: // caso
			System.out.println("Horário das aulas 08:00 às 12:00");
			break;
		case 2: // caso
			System.out.println("Horário das aulas 13:00 às 17:00");
			break;
		case 3: // caso
			System.out.println("Horário das aulas 18:00 às 22:00");
			break;
		default: // outrocaso
			System.out.println("Opcão de turno invalida!");
			break;
		}

		leitor.nextLine();
		System.out.println("Informe o nome do alunoª:");
		String nomeA = leitor.nextLine();

		System.out.println("Informe o nome do professoraª:");
		String nomeP = leitor.nextLine();

		System.out.println("Informe a 1º nota");
		String nota1 = leitor.nextLine().replace(",", ".");

		System.out.println("Informe o 2° nota: ");
		String nota2 = leitor.nextLine().replace(",", ".");

		System.out.println("Informe o 3° nota: ");
		String nota3 = leitor.nextLine().replace(",", ".");

		System.out.println("Informe o 4° nota: ");
		String nota4 = leitor.nextLine().replace(",", ".");

		double notanova1 = Double.parseDouble(nota1);
		double notanova2 = Double.parseDouble(nota2);
		double notanova3 = Double.parseDouble(nota3);
		double notanova4 = Double.parseDouble(nota4);
		double media = (notanova1 + notanova2 + notanova3 + notanova4) / 4;

		System.out.println("Nome do aluno:" + nomeA);
		System.out.println("Nome da professora:" + nomeP);
		System.out.printf("Media do aluno %.2f%n :" + media);
		if (media >= 7) {

			System.out.println("Esse alunoª está aprovado");
		} else if (media > 5) {

			System.out.println("Esse alunoª está de recuperação");
		} else {

			System.out.println("Esse alunoª está reprovado");
		}
		leitor.close();

	}

}
