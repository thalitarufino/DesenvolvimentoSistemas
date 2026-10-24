package fundamentos;

import java.util.Scanner;

public class ConversaoStringParaNumero {

    public static void main(String[] args) {

        // Conversao de String para numero

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o 1° valor:");
        String valor1 = leitor.nextLine();

        System.out.println("Informe o 2° valor:");
        String valor2 = leitor.nextLine();

        System.out.println("Não é soma, e sim texto: " + valor1 + valor2);

        // Conversao para Double(Parsing)

        double novovalor1 = Double.parseDouble(valor1);
        double novovalor2 = Double.parseDouble(valor2);

        double soma = novovalor1 + novovalor2;

        System.out.println("Depois da conversão, posso somar double: " + soma);

        // Conversao para Inteiro
        int inteirovalor1 = Integer.parseInt(valor1);
        int inteirovalor2 = Integer.parseInt(valor2);

        int somaint = inteirovalor1 + inteirovalor2;
        System.out.println("Depois da conversão, posso somar int: " + somaint);

        System.out.println("Informe a sua altura: ");
        String altura = leitor.nextLine().replace(",", ".");
        //.replece - CASO O USUARIO DIGITE VIRGULA (,) EM VEZ DE (.)
        double novaltura = Double.parseDouble(altura);

        System.out.println("Sua altura: " + novaltura);

        leitor.close();
    }

}
