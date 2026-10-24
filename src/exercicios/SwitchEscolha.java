package exercicios;
import java.util.Locale;
import java.util.Scanner;
public class SwitchEscolha {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Selecione o Turno: [1] Manhã | [2] Tarde | [3] Noite");
		int opcao = leitor.nextInt();
		switch (opcao) { //escolha
		
		case 1: //caso
			System.out.println("Horário das aulas 08:00 às 12:00");
			break;
		case 2: //caso
			System.out.println("Horário das aulas 13:00 às 17:00");
			break;
		case 3: //caso
			System.out.println("Horário das aulas 18:00 às 22:00");
			break;
			default: //outrocaso
				System.out.println("Opcão de turno invalida!");	
				break;
		}
		leitor.close();
	}
	
}
