package joptionpane;

import javax.swing.JOptionPane;

public class Janela {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Bem vindo ao SENAI!!");
		String nome = JOptionPane.showInputDialog("Informe o seu nome:");
		String sobrenome = JOptionPane.showInputDialog("Informe o seu sobrenome:");
	String idade = JOptionPane.showInputDialog("Informe a sua idade; ");
	
		JOptionPane.showMessageDialog(null,"Seu nome: " + nome 
				+ "\nSeu sobrenome: " + sobrenome 
				+ "\nSua idade é: " + idade );

		String valor1 = JOptionPane.showInputDialog("Informe o valor 1");
		String valor2 = JOptionPane.showInputDialog("Informe o valor 2");
		String soma = valor1 + valor2 ;
		
		 
		JOptionPane.showMessageDialog(null, "Isso não é soma: " + soma);
		
		int novovalor1 = Integer.parseInt(valor1);
		int novovalor2 = Integer.parseInt(valor2);
		
		int novasoma = novovalor1 + novovalor2;
		JOptionPane.showMessageDialog(null, "Soma int: " + novasoma);
	}

}
