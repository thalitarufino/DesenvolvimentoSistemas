package encapsulamento;
//import java.util.Scanner;
import javax.swing.JOptionPane;
public class FutbolObjeto {

	public static void main(String[] args) {

		//Scanner leitor = new Scanner(System.in);

		Futebol time = new Futebol();

		//System.out.print("Digite seu time do coração: ");
		//String nome = leitor.nextLine();

		
		String nome = JOptionPane.showInputDialog("Digite seu time do coração: ");
		time.setNomeTime(nome);
		

		time.status();

		//leitor.close();
	}
}
