package exercicios;
import java.util.Scanner;
import java.util.Locale;
public class Exercicios2 {

	public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			Locale.setDefault(Locale.US);
			
			System.out.println("Informe o seu nome:");
			String nome = leitor.nextLine();
			System.out.println("Informe o seu salario:");
			double salario = leitor.nextInt();
			
			System.out.println("Nome do Funcionário: " + nome + " Salario: " + salario);
			
leitor.close();			
	}

}
