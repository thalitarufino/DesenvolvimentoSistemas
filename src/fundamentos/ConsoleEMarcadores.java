package fundamentos;

public class ConsoleEMarcadores {

	public static void main(String[] args) {
		// %s - String
		// %d - int
		// %f - double (com casa decimal %.2f)

		String nome = "Thalita";
		String sobrenome = "Rufino";
		double salario = 10.5;
		// adicionar f de formatado

		System.out.printf("Números do Mega-sena: %d %d %d %n", 1, 2, 3);
		System.out.printf("Salário: RS%.2f %n", salario);
		
		System.out.println("Concatenar com printf");
		System.out.printf("Nome: %s %s %n", nome, sobrenome);

		System.out.println("Concatenar com println");
		String nome1 = "Ester";
				String sobrenome1 = "Campos";
				System.out.println("Meu nome é: " + nome1+ " " + sobrenome1);
	}

}
