package estrutura;
import java.util.Locale;
import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Avalie o meu atentimento(De 0 a 10): ");
		int valor = leitor.nextInt();

		
		//se senao if else
		if (valor>=7) {
			
		System.out.println("Atendimento bom!");
		}else if (valor>5) {
			System.out.println("Atendimento razoavel!");	
		}else {
			System.out.println("Melhorar o atendimento!");
		}
		leitor.close();
	}

}
