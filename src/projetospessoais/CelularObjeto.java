package projetospessoais;

public class CelularObjeto {

	public static void main(String[] args) {
		
		Celular c1 = new Celular ("Iphone", "8 plus", 128);
		c1.status();
		c1.ligado();
		System.out.println();
		
		Celular c2 = new Celular ("Samsung", "S26 Utra", 256);
		c2.status();
		c2.ligado();
	}

}
