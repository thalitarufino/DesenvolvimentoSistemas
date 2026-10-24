package poo;
import java.util.Scanner; 


public class ClienteNovo {
	
	public static void main(String[] args) {
  Scanner leitor = new Scanner(System.in);
		

Cliente cliente1 = new Cliente ();
System.out.println("Informe o nome");
cliente1.nome = leitor.nextLine();
System.out.println("Informe a idade");
cliente1.idade = leitor.nextInt();
System.out.println("Informe o telefone");
cliente1.telefone = leitor.nextInt();
	cliente1.exibirdados();
	leitor.close();
	}
	

}