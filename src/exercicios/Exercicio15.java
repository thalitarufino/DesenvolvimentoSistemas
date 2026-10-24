package exercicios;
import java.util.Scanner;
public class Exercicio15 {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	
	
	 for  (int i = 1; i <= 10; i++)  {
		 System.out.print("Informe a sua idade: ");
		 int idade = leitor.nextInt();
		 
		 if  (idade >=18) {
			 System.out.println("Maior de idade");
		 }
		 else {
			 System.out.println("Menor de idade");
		 }
leitor.close();
}

	}

}
