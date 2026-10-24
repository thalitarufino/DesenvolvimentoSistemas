package poo;

public class EscolaNova {

    public static void main(String[] args) {
        
        // 1. Objeto criado com o construtor sem parâmetros
        Escola aluno = new Escola();
        System.out.println("construtor SEM parâmetros");
        aluno.nome = "Robson";
        aluno.idade = 32;
        aluno.curso = "WEB";
        aluno.exibirDados();
        
        System.out.println(); // Linha em branco para organizar o console

        // 2. Objeto criado com o construtor com parâmetros
        System.out.println("construtor COM parâmetros");
        Escola aluno1 = new Escola("Thalita", 17, "SISTEMA");
        aluno1.exibirDados();

        System.out.println("*******");

    }
}