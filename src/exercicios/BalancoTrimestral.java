package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class BalancoTrimestral {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		/*
		 * System.out.println("Balanço Trimestral da XPTO"); System.out.println(" ");
		 * System.out.println("Primeiro Trimestre"); System.out.println(" ");
		 * System.out.println("Gastos de Janeiro: R$15.000");;
		 * System.out.println("Gastos de Fevereiro: R$17.000");
		 * 
		 * int janeiro = 15000; int fevereiro = 23000; int marco = 17000;
		 * 
		 * int somaTotal = janeiro + fevereiro + marco ; somaTotal = somaTotal/3;
		 * 
		 * System.out.println("Despesas totais desse trimestre: R$" + somaTotal);
		 * System.out.println("Média mensal dos gastos: R$" + somaTotal);
		 * System.out.println(" ");
		 */

		/*
		 * System.out.println("Balanço Trimestral da XPTO (Formatado)");
		 * System.out.printf("Despesas total do trimestre: %d \n", (15000+23000+17000));
		 * System.out.printf("Média total de gastos do trimestre: %d \n",((15000+23000+17000)/3 )/
		 * 3));
		 */

		System.out.println("Balanço Trimestral da XPTO (Formatado)");
		System.out.println("Informe os gastos do mês de Janeiro:");
		int janeiro = leitor.nextInt();
		
		System.out.println("Informe os gastos dos mês de Fevereiro:");
		int fevereiro = leitor.nextInt();
		
		System.out.println("Informe os gastos dos mês de Março:");
		int marco =  leitor.nextInt();
		
		
		System.out.printf("As despesas total do trimestre: %d \n", (janeiro+fevereiro+marco));
		System.out.printf("Média total de gastps do trimestre: %d \n",  ((janeiro+fevereiro+marco)/3));
		
		leitor.close();
		
		

	}

}
