package fundamentos;

public class Format {

	public static void main(String[] args) {
//String salario = 1500.5678;
		double salario = 1500.5678;

		System.out.println("double " + salario);
		System.out.println("\nOpção 1 ");
		System.out.printf("%.2f", salario);
		System.out.printf("\nSalario: %.2f", salario);

		System.out.println("\nOpção 2");
		System.out.println(String.format("%.2f", salario));
System.out.println("Salario: " + String.format("%.2f", salario));
	}

}
