package fundamentos;

public class Variavel01 {

	public static void main(String[] args) {
		
		int idade = 17;
		String nome = "thalita" ;
		double salario = 30545.55;
		char genero  = 'F';
		boolean condicao = idade <18 ; //TRUE || FALSE
				
		System.out.println(nome);
		System.out.println(salario);
		System.out.println(genero);
		System.out.println(idade);
		
		//concatenar
		System.out.println("********************************");
		System.out.println("Meu nome é " + nome );
		System.out.println( "Eu tenho " + idade +  " anos");
		System.out.println( "Eu ganho " + salario );
		System.out.println("Meu genero: " + genero);
		
		System.out.println(condicao);
		 
		System.out.println("Meu nome é " +  nome + 
				 " \nmeu gênero é " + genero + " (Feminino)" +
				" \neu tenho " + idade + " ," +
				" \nAtualmente eu estou ganhando " + salario );
	}

}
