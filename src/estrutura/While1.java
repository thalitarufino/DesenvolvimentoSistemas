package estrutura;

public class While1 {
    public static void main(String[] args) {

	        int i = 10;
	        while (i >= 1) {
	            System.out.println("i: " + i);
	            i--; // pode usar i++ (i=1) (i<=10)
	        }

	        int contador = 0;
	        while (contador <= 20) { // CONDIÇÃO 1 ATÉ 10 INC...
	            contador += 2;
	            System.out.printf("A = %d\n", contador);
	        }
	    }
	}

