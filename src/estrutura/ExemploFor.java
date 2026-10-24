package estrutura;
import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) {
        //FOR - PARA

        Scanner leitor = new Scanner (System.in);
        double soma = 0;
        for (int i = 1;i <= 3 ;i++) {
            System.out.printf("EXEMPLO DE PRINTF- Informe a %dº nota:",i);
            double nota = leitor.nextDouble();
            //System.out.println("EXEMPLO DE PRINTln- Informe a "+i+"º nota");
            //double nota1 = leitor.nextDouble();

            //soma = soma + nota;
            soma+= nota;// forma simplica - atribuição 
        }
        double media = soma/3;

        System.out.println("Soma:"+soma);
        System.out.println("Média:"+media);
        leitor.close();
    }
}