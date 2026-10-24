package fundamentos;
import java.util.Scanner;
public class Logico03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Possui carteira de habilitação? (true/false): ");
        boolean temCarteira = sc.nextBoolean();
        // as DUAS condições precisam ser verdadeiras
        if (idade >= 18 && temCarteira) {
            System.out.println("Pode dirigir.");
        } else {
            System.out.println("Não pode dirigir.");
        }
        // exemplo com "ou" e "não"
        if (idade < 12 || idade > 65) {
            System.out.println("Tem direito a desconto.");
        }
        if (!temCarteira) {
            System.out.println("Procure uma autoescola.");
        } 
        sc.close();
        } 
   }
