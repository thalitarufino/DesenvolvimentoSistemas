package poo;

public class Escola {
    // Atributos
    String nome;
    int idade;
    String curso;

    // Construtor 1: sem parâmetros
    public Escola() {
        System.out.println("Escola SENAI!!!!");
    }

    // Construtor 2: com parâmetros
    public Escola(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    // Método para exibir os dados no console
     void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Curso: " + this.curso);
    }
}