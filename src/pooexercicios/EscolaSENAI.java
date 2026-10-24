package pooexercicios;


public class EscolaSENAI {

    // Atributos da classe
    String nome;
    double nota1;
    double nota2;
    double nota3;

    // Construtor 1: recebe apenas o nome
    public EscolaSENAI() {
        System.out.println("---Escola SENAI---");
    }

    // Construtor 2: recebe o nome e as três notas
    public EscolaSENAI(String nome, double nota1,
                       double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Método com retorno: calcula a nota final
    double calcularNotaFinal() {
        return this.nota1 + this.nota2 + this.nota3;
    }

    // Método sem retorno: exibe o boletim
    void exibirBoletim() {

        double notaFinal = calcularNotaFinal();

        System.out.println("===== BOLETIM ESCOLAR =====");
        System.out.println("Nome: " + this.nome);
        System.out.println("Nota 1: " + this.nota1);
        System.out.println("Nota 2: " + this.nota2);
        System.out.println("Nota 3: " + this.nota3);
        System.out.println("Nota final: " + notaFinal);

        if (notaFinal >= 60) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        } 
    }
}
