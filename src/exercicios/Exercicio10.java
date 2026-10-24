package exercicios;


import java.util.Locale;
import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		int n1 =0;
		int n2 = 0;

		for (int i = 1; i <= 2; i++) {
		    System.out.println("Informe o " + i + "º número:");
		    int numero = leitor.nextInt();

		    if (i == 1) {
		        n1 = numero;
		    } else {
		        n2 = numero;
		    }
		}
		System.out.println(
				"Selecione as opcões: \n" 
		+ "[1]Somar\n" 
		+ "[2]Subtrair\n" 
		+ "[3]Multiplicar\n" 
		+ "[4]Dividir");
	

		int opcao = leitor.nextInt();
		
         int total= 0;
         
		switch (opcao) {

		case 1:
			total = n1 + n2;
			break;
		case 2:
			total = n1 - n2;
			break;
		case 3:
			 total = n1 * n2;
			break;
		case 4:
			 total = n1 / n2;
			break;

		default:
			System.out.println("Opção invalida");
			break;
		}

		if (total >= 10) {
			System.out.println("O resultado é maior ou igual a 10");
		} else {
			System.out.println("O resultado é menor que 10.");
		}
leitor.close();
	}

}
