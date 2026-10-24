package pooexercicios;

public class ExercicioCarros {
	// Minha classe principal
	
	String marca ;
	String modelo ;
	int ano ;
	String cor; 
	String placa;
	String combustivel;
	// Metodos 
	void exibirininformações() {
	System.out.println("Informacoes do carro ");	
    System.out.println("Marca: "+marca);
    System.out.println("Modelo: "+modelo);
    System.out.println("ANO: "+ano);
    System.out.println("Cor: "+cor);
    System.out.println("Placa: "+placa);
    System.out.println("Combustível: "+combustivel);
    
	}
   void ExibirDados ( ) {
	   System.out.println();   
   }
   void Ligar () { 
	   System.out.println("Carro ligado");
   }
   void Desligar() {
	   System.out.println("CArro desligado");   
   }
   void LigarFarol () {
	   System.out.println("LIgar Farol");
   }
}














