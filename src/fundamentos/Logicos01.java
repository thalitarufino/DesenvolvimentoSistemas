package fundamentos;

public class Logicos01 {

    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println("OPERADOR LÓGICO");
        System.out.println(condicao1);
        System.out.println(condicao2);
        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!condicao1);
        System.out.println(!condicao2);

        //TABELA VERDADE E (&&)
        System.out.println("\nTABELA VERDADE E (&&)");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false);
        System.out.println(false);

        //TABELA VERDADE OU (||)
        System.out.println("\nTABELA VERDADE OU (||)");
        System.out.println(true);
        System.out.println(true);
        System.out.println(false || true);
        System.out.println(false || false);

        //TABELA VERDADE OU EXCLUSIVO (XOR)
        System.out.println("\nTABELA VERDADE OU EXCLUSIVO (XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        //TABELA VERDADE NEGAÇÃO NOT (!)
        System.out.println("\nTABELA VERDADE NOT (!)");
        System.out.println(!true);
        System.out.println(!false);
    }

}