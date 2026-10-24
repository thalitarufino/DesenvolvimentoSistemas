package pooexercicios;

public class CarroExercicio {

	String marca, modelo, cor, placa, combustivel;
	int ano;

	void exibirDados() {
		System.out.printf("Informações do carro:" + "%nMarca: %s" + "%nModelo: %s" + "%nAno: %d" + "%nCor: %s"
				+ "%nPlaca: %s" + "%nCombustível: %s %n %n", marca, modelo, ano, cor, placa, combustivel);
	}

	void ligar() {
		System.out.println("Carro ligado.");
	}

	void desligar() {
		System.out.println("Carro desligado.");
	}

	void ligarfarol() {
		System.out.println("Farol ligado.");
	}

}
