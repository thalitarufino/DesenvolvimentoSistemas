package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner leitor = new Scanner(System.in);

		System.out.println("Infome o primeiro numero");
		int n1 = leitor.nextInt();

		System.out.println("Infome o segundo numero");
		int n2 = leitor.nextInt();

		int soma = n1 + n2;
		int sub = n1 - n2;
		int mult = n1 * n2;
		int div = n1 / n2;

		System.out.println(n1 + " + " + n2 + " = " + soma);
		System.out.println(n1 + " - " + n2 + " = " + sub);
		System.out.println(n1 + " * " + n2 + " = " +mult);
		System.out.println(n1 + " / " + n2 + " = " + div);
		leitor.close();

	}

}
