package fundamentos;

public class Relacionais {
	   
		   public static void main(String[] args) {
		       
		       int a = 97;
		       int b = 'a';
		       
		       //1º condição
		       System.out.println(a == b); //== equivale
		       System.out.println(a); //== equivale
		       System.out.println(b); //== equivale
		       
		       //2º condição
		       System.out.println(3 > 4);
		       System.out.println(3 < 4);
		       System.out.println(3 >= 4);
		       System.out.println(33 <= 10);
		       System.out.println(3 != 4);
		       
		       //3º condição
		       double nota = 7.3; // acima de 7 aprovado, abaixo reprovado
		       boolean bomComportamento = true; // mudar pra false e mudar a nota para 9
		       boolean passouPorMedia = nota >= 7;
		       boolean temDesconto = bomComportamento && passouPorMedia;
		       
		       System.out.println("Tem desconto? "+temDesconto);
		       
		   }

		}
