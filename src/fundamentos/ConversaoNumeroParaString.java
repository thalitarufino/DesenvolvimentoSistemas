package fundamentos;

public class ConversaoNumeroParaString {

    public static void main(String[] args) {

        // CONVERSAO DE NÚMERO PARA STRING
        double v1 = 99.99;
        int v2 = 30;
        System.out.println(v1+v2);

        //CONVERSÃO NÚMERO PARA STRING
        System.err.println("CONVERSÃO NÚMERO PARA STRING");
        String novovalor1 = String.valueOf(v1);
        String novovalor2 = String.valueOf(v2);
        System.out.println("NÃO É SÓ SOMA, É SIM ATIVAR OS TEXTOS");
        System.out.println(novovalor1+novovalor2);

        // OPÇÃO 2
        System.out.println(Double.toString(v1));
        System.out.println(Integer.toString(v2));

        //********************
        int numero = 42;
        double decimal = 3.1416;

        System.err.println("1º opção");

        System.out.println(Integer.toString(numero));
        System.out.println(Double.toString(decimal));
        String strNumero = Integer.toString(numero);
        String strDecimal = Double.toString(decimal);

        System.out.println("Inteiro convertido: " + strNumero);
        System.out.println("Decimal convertido: " + strDecimal);


        // CONVERSÃO FLOAT PARA STRING
        System.err.println("CONVERSÃO FLOAT PARA STRING");
        float flutuante = 1.86f;

        String FlutuanteNovo = Float.toString(flutuante);
        System.out.println("Float convertido: " + FlutuanteNovo);


    }
}