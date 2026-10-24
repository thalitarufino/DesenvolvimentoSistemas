package encapsulamento;

public class CanetaObjeto {

    public static void main(String[] args) {

        Caneta c1 = new Caneta("Bic", "Amarelo", 0.5f, 4);

        c1.status();
        c1.setTampada(true);  // Tampar a caneta
        c1.rabiscar();
        System.out.println();

        Caneta c2 = new Caneta("Bic", "Azul", 1.0f, 5);

        c2.status();
        c2.setTampada(false); // Destampar a caneta
        c2.rabiscar();

    }
}
