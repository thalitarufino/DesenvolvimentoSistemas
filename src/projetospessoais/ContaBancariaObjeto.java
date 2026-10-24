package projetospessoais;

public class ContaBancariaObjeto {
	public static void main(String[] args) {
		
		ContaBancaria p1 = new ContaBancaria();
		p1.setNumconta(111);
		p1.setDono("Thalita");
		p1.abrirConta("CC");
		
		System.out.println();
		
		ContaBancaria p2 = new ContaBancaria();
		p2.setNumconta(222);
		p2.setDono("Gian");
		p2.abrirConta("CP");
		
		System.out.println("");
		p1.depositar(100);
		p2.depositar(500);
		p2.sacar(1000);
		
		System.out.println("");
		p1.sacar(150);
		p1.fecharConta();
		p1.statusAtual();
		p2.statusAtual();
	

	}

}
