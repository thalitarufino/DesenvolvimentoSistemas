package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio7RH {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
 
		System.out.println("Digite o nome do funcionario: ");
		String nome = leitor.nextLine();
		
		System.out.println("Informe o 1° salario: ");
		String valor1 = leitor.nextLine().replace(",",".");
		
		System.out.println("Informe o 2° salario: ");
		String valor2 = leitor.nextLine().replace(",",".");
		
		System.out.println("Informe o 3° salario: ");
		String valor3 = leitor.nextLine().replace(",",".");
		
		double novovalor1= Double.parseDouble(valor1);
		double novovalor2= Double.parseDouble(valor2);
		double novovalor3= Double.parseDouble(valor3);
		double soma = (novovalor1 + novovalor2 + novovalor3) / 3;
		
		System.out.println("Nome do funcionario: " + nome);
		System.out.printf("1° salario: R$ %.2f\n" , novovalor1);
		System.out.printf("2° salario: R$ %.2f\n" , novovalor2);
		System.out.printf("3° salario: R$ %.2f\n" ,novovalor3);
		System.out.printf("Media do salario doª "+ nome + ":R$ %.2f " , soma);
		leitor.close();		
	}

}
