package pooexercicios;
import java.util.Scanner;
//import POO.CarroPrincipal;
public class ExercicioCarrosObj {

	public static void main(String[] args) {
	
	// criando obj Honda Renault Fiat Ford Chevrolet
	ExercicioCarros car1 = new ExercicioCarros ();
		car1.marca = "Honda";
		car1.modelo = "ss";
		car1.ano = 2000;
		car1.cor = "Azul";
		car1.placa = "222333";
		car1.combustivel = "GNV";
		car1.ExibirDados();
		car1.Ligar();
		car1.Desligar();
		car1.LigarFarol();
		
	ExercicioCarros car2 = new ExercicioCarros ();
	    car2.marca = "Renault";
	    car2.ano = 2000;
	    car2.cor = "Azul";
	    car2.placa = "131";
	    car2.combustivel = "Alcol";
	    car2.ExibirDados();
	    car2.Ligar();
	    car2.Desligar();
	    car2.LigarFarol();
	    
    ExercicioCarros car3 = new ExercicioCarros ();    
	    car3.marca = "Fiat";
	    car3.ano = 2000;
	    car3.cor = "Azul";
	    car3.placa = "500";
	    car3.combustivel = "GNV";
	    car3.ExibirDados();
	    car3.Ligar();
	    car3.Desligar();
	    car3.LigarFarol();
	    
     ExercicioCarros car4 = new ExercicioCarros ();    
       car4.marca = "Ford";
       car4.ano = 2000;
       car4.cor = "Azul";
       car4.placa = "5044";
       car4.combustivel = "GNV";
       car4.ExibirDados();
       car4.Ligar();
       car4.Desligar();
       car4.LigarFarol(); 
	    
      ExercicioCarros car5 = new ExercicioCarros ();    
       car5.marca = "Chevrolet";
       car5.ano = 2000;
       car5.cor = "Azul";
       car5.placa = "5044";
       car5.combustivel = "GNV";
       car5.ExibirDados();
       car5.Ligar();
       car5.Desligar();
      car5.LigarFarol();    
	    
   ExercicioCarros car6 = new ExercicioCarros ();    
   car6.marca = "Chevrolet";
   car6.ano = 2000;
   car6.cor = "Azul";
   car6.placa = "5044";
   car6.combustivel = "GNV";
   car6.ExibirDados();
   car6.Ligar();
   car6.Desligar();
   car6.LigarFarol();    
	
System.out.println("TESTE DE COMPARAÇÃO*");
//STATUS: 1 o que acontece?
if (car5 == car6) {
	System.out.println("STATUS:1 São Iguais");
}else {System.out.println("STATUS:1 Diferentes ");
}
/*Respota: false como resposta. Isso é porque variáveis
 * guardam apenas as referências!
 * Por mais que dois objetos diferentes tenham as mesmas
 * informaçoes, cada um deles é um objeto à parte.
 */
car6 = car5;
//STATUS:2 o que acontece?
if (car5 == car6) {
	System.err.println("STATUS:2 São Iguais");
}else {System.out.println("STATUS : 2 Diferentes");
}	
/* true . Isso porque, de fato, ambas as variáveis têm referencias ao mesmo 
 * objeto
 * */
 // metodo com Scanner!!!
ExercicioCarros car99 = new ExercicioCarros();
Scanner leitor = new Scanner(System.in);

System.out.println("car99-Informe modelo:");
car99.modelo = leitor.nextLine();

System.out.println("car99-Informe o ano:");
car99.ano = leitor.nextInt();
car99.exibirininformações();
leitor.close();
	}

}

