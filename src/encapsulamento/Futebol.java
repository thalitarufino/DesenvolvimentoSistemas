package encapsulamento;
import javax.swing.JOptionPane;
public class Futebol {
	private String NomeTime;

	public String getNomeTime() {
		return NomeTime;
	}

	public void setNomeTime(String nomeTime) {
		NomeTime = nomeTime;
	}

	public void status() {
		//System.out.println("Meu time do coracao é " + getNomeTime());
		JOptionPane.showMessageDialog(null,"Meu time do coração é " + getNomeTime());
	}

}
 