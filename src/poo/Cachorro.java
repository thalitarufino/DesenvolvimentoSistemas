package poo;

public class Cachorro {
    //ATRIBUTOS - CARACTERÍSTICAS
	String nome;
	int idade;
	
	//MÉTODOS - AÇÕES
	//Quero criar métodos para exibir e não devolver nada para essa classe
	void exibirDados() { // VOID não retorna nada para essa classe
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
	}
	
	void latir() {
		System.out.println(nome+": Au, au.......");
	}
	
	void brincar() {
		System.out.println("Pegar a bolinha.");
	}
	
}
