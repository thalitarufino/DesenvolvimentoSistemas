package poo;

public class Produto {

//atributos - o que o objeto tem
	String loja;
	String nome;
	double preco;
	int quantidade;
	
	//Criando um contrutor
	public Produto() {
		System.out.println("Meu primeiro contrutor");
	}

//métodos - o que o objeto faz
	
	void mostrados() {
		System.out.println("***Loja " + this.loja + "***");
		System.out.println("Nome: " + this.nome);
		System.out.println("Preço: "+ this.preco);
		System.out.println("Quantidade: "+this.quantidade);	
	}	
		double precoTotal;
		void calculaPreco()	{
			this.precoTotal = this.preco * this.quantidade;
			System.out.println("Valor total: " + this.precoTotal);
		}
		void bonus () {
			if  (this.precoTotal > 5000) {
				System.out.println("PARABÉNS - VOCÊ ACABOU DE GANHAR UM MOUSE PERSONALIZADO!");
				System.out.println("");
			} 
		}

}
