package projetospessoais;

import java.util.Scanner;
import java.util.Locale;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double nota = 0;
		double media = nota;
		
		for (int i = 1; i <= 3; i++) {
			System.out.printf("Informe a %d nota: \n ", i);
			nota = leitor.nextDouble();

			media = nota + media;
		}
		double resultado = media / 3;
		
		if (media >= 7){ 
			System.out.println("Média Total: " + resultado);
			System.out.println("APROVADO!!!");
			
		}else if  (media>=5  ){
			System.out.println("Média Total: " + resultado);
			System.out.println("RECUPERAÇÃO!!!");
		} else {
			System.out.println("Média Total: " + resultado);
			System.out.println("REPROVADO!!!");
		}
		
		leitor.close();

	}
}
