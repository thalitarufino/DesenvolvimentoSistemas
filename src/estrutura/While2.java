package estrutura;
import java.util.Scanner;

public class While2 {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Digite a senha : ");
	        int senha = sc.nextInt();

	        while (senha != 1234) { // repete enquanto err...
	            System.out.println("Senha incorreta!");
	            System.out.print("Tente novamente: ");
	            senha = sc.nextInt(); // atualiza a variável t...
	        }
	        System.out.println("Acesso liberado!");
	        sc.close();
	    }
	}

