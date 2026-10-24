package pooexercicios;

public class CarroObjeto {

	public static void main(String[] args) {
		
		CarroExercicio car1 = new CarroExercicio();
		
		car1.marca = "honda";
		car1.modelo = "civicão";
		car1.ano = 1999;
		car1.cor = "Preto";
		car1.placa = "RDF1J67";
		car1.combustivel = "flex";
		car1.exibirDados();
		
		
		CarroExercicio car2 = new CarroExercicio();
		car2.marca = "Renault";
		car2.modelo = "Sandero RS";
		car2.ano = 2022;
		car2.cor = "Vermelho";
		car2.placa = "TJG4K00";
		car2.combustivel = "flex";
		car2.exibirDados();

		CarroExercicio car3 = new CarroExercicio();
		car3.marca = "Fiat";
		car3.modelo = "Palio Adventure";
		car3.ano = 2012;
		car3.cor = "Prata";
		car3.placa = "KRM4088";
		car3.combustivel = "Gasolina";
		car3.exibirDados();

		CarroExercicio car4 = new CarroExercicio();
		car4.marca = "Ford";
		car4.modelo = "Fusion";
		car4.ano = 2021;
		car4.cor = "Branco";
		car4.placa = "NVT0N13";
		car4.combustivel = "flex";
		car4.exibirDados();

		CarroExercicio car5 = new CarroExercicio();
		car5.marca = "Chevrolet";
		car5.modelo = "Onix";
		car5.ano = 2020;
		car5.cor = "Preto";
		car5.placa = "QWP4V72";
		car5.combustivel = "flex";
		car5.exibirDados();

		CarroExercicio car6 = new CarroExercicio();
		car6.marca = "Chevrolet";
		car6.modelo = "Onix";
		car6.ano = 2020;
		car6.cor = "Preto";
		car6.placa = "QWP4V72";
		car6.combustivel = "flex";
		car6.exibirDados();
		
		
		System.out.println("TESTE DE COMPARAÇÃO");

		//STATUS:1 o que acontece?
		if (car5 == car6) {
		    System.out.println("STATUS:1 São Iguais");
		} else {
		    System.out.println("STATUS:1 Diferentes");
		}

		/*Resposta: false como resposta. Isso é porque variáveis
		 * guardam apenas as referências!
		 * Por mais que dois objetos diferentes tenham as mesmas
		 * informações, cada um deles é um objeto a parte.
		 */

		car6 = car5; 

		//STATUS:2 o que acontece?
		if (car5 == car6) {
		    System.out.println("STATUS:2 São Iguais");
		} else {
		    System.out.println("STATUS:2 Diferentes");
		}

		/* true. Isso porque, de fato, ambas as variáveis têm referências ao mesmo
		 * objeto.
		 */

		
		
	}

}
