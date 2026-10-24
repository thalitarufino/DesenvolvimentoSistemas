package poo;

public class NovoCachorro {

	public static void main(String[] args) {
		//Instanciar meu objeto
		//Criar objeto
		Cachorro dog1 = new Cachorro();
		System.out.println("Meu primeiro objeto:");
		dog1.nome = "Mutlley";
		dog1.idade = 11;
		dog1.exibirDados();
		dog1.latir();
		dog1.brincar();
		
		//Meu segundo objeto criado.
		Cachorro dog2 = new Cachorro();
		dog2.nome = "Scooby-doo";
		dog2.idade = 13;
		System.out.println("Meu segundo objeto:");
		dog2.exibirDados();
		

	}

}
