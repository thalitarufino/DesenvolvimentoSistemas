package poo;

public class CarroPrincipal {
//atributos
	String nome;
	int ano;
	
	//metodos
	void exibirinformações() {
		/*&System.out.println("Informações do carro");
		System.out.println("Nome: "+nome);
		System.out.println("Ano: "+ano);*/
		
		//OU
		
		System.out.printf("Informações do carro:"
				+ "%nNome do carro: %s"
				+ "%nAno do carro: %d",nome,ano);
	}
		
		void ligarcarro() {
			System.out.println("Carro ligado.");
		}
		
		void desligarcarro() {
			System.out.println("Carro desligado.");
		}
		
		void acelerar() {
			System.out.println("trummmmmtututututututututu");
		}
	}

