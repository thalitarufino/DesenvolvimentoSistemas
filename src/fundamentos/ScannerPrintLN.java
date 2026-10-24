package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class ScannerPrintLN {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o seu nome:");
		String nome = leitor.nextLine();

		System.out.println("Informe a sua idade:");
		int idade = leitor.nextInt();

		System.out.println("Informe o seu salario:");
		double salario = leitor.nextInt();
		
		 leitor.nextLine(); // essa linha serve para tirar o bug do SCANENER
		 
		System.out.println("Informe o seu sobrenome:");
		String sobrenome = leitor.nextLine();


		System.out.println("");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
		System.out.println("Sobrenome: " + sobrenome);
	
		leitor.close();

}
}
