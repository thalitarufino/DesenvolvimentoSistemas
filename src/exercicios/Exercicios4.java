package exercicios;
import java.util.Scanner;

public class Exercicios4 {


		public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("Informe o nome do aluno: ");
			String nome = leitor.nextLine();
			
			System.out.println("Informe a primeira nota:");
			double nota1 = leitor.nextDouble();
			
			System.out.println("Informe a segunda nota:");
			double nota2 = leitor.nextDouble();
			
			System.out.println("Informe a terceira nota:");
			double nota3 = leitor.nextDouble();
			
			System.out.println("Informe a quarta nota:");
			double nota4 = leitor.nextDouble();
			
			System.out.println("Informe a quinta nota:");
			double nota5 = leitor.nextDouble();
			
			
			
			double media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
					
			System.out.println("Nome do aluno:" + nome);
			 System.out.printf("Media do aluno = %.1f%n", media);
leitor.close();
}

	}
