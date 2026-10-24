package projetospessoais;
import java.util.Locale;

import javax.swing.JOptionPane;
public class Atividade3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double soma = 0;
		
		for(int i =1; i<=3; i++) {
		String nota = JOptionPane.showInputDialog("Informe a " + i + " nota: ");
				double novanota = Double.parseDouble(nota);
	
		soma = soma + novanota;
		}
		

		
	double media =	soma/3;
	
	JOptionPane.showMessageDialog(null,"Média total: " +  media) ;
	}

}
