package fundamentos;

public class InterferenciaTipo {
	public static void main(String[] args) {
		// Surgiu no JAVA 10 a inferência

		double a = 4.5; // declarando e inicializando a variável
		System.out.println(a);

		var b = "texto"; // definido como string (O java vai identificar)
		System.out.println(b);

		var c = "outro texto";// definido como string
		System.out.println(c);

		double d;// variável declarada
		d = 12.1; // variável foi inicializada
		System.out.println(d);// usada

		var e = 23.1;// declarando e inicializando a variável VAR JÁ SABE QUE É DOUBLE
		System.out.println(e);

		// *errado fazer dessa forma
		var numero = 22;
		numero = (int) 12.2; // Erro! Não pode mudar para String
		System.out.println(numero);

		// var f; //precisa ser declarado e iniciado junto
		// f = 3;
		// System.out.println(f);

	}
}