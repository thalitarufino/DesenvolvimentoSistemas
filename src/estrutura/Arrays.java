package estrutura;
	import java.util.Scanner;
public class Arrays {
	    public static void main(String[] args) {

	        Scanner leitor = new Scanner(System.in);

	        // Cria um array chamado "idades" com espaço para 15 idades
	        int[] idades = new int[15];

	   
	        for (int i =0; i < 14; i++) {
	        	 
	            System.out.print("Digite a idade do aluno " + (i + 1) + ": ");

	            // Guarda a idade digitada dentro do array
	            idades[i] = leitor.nextInt();
	        }

	    
	        System.out.println("\nIdades de trás para frente:");

	        // FOR usado para percorrer o array de trás para frente
	        // Começa na posição 14, que é a última posição do array
	        for (int i = 14; i >= 0; i--) {

	            System.out.println(idades[i]);
	        }


	        leitor.close();
	    }
	}
 
