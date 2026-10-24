package fundamentos;

public class Unitario {

	public static void main(String[] args) {

		//UNITÁRIO - Incremento e Decremento
		int a = 1;
		int b = 2;

		//Pós
		//a++;  //a = a + 1  Pós-incremento
		//a--;  //a = a - 1  Pós-decremento

		//Pré
		++b;  // b = b + 1; pré-incremento
		--b;  // b = b - 1; pré-decremento

		/*
		    ++a  pré-incremento **AUMENTA ANTES USAR
		    a++   pós-incremento **USA ANTES, AUMENTA DEPOIS
		    --a   pré-Decremento **DIMINUI ANTES USAR
		    a--   pós-incremento **USA ANTES, DIMINUI DEPOIS
		*/ 

		System.out.println(a);//1
		System.out.println(b);//2

		System.out.println("\nMini Desafio 01....");
		System.out.println(a++ == b--);// qual resultado?

	}

}