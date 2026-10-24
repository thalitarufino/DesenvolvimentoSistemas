
package pooexercicios;

public class EscolaSENAIObjeto {

    public static void main(String[] args) {

        // Objeto 1: construtor que recebe apenas o nome
        EscolaSENAI escola = new EscolaSENAI();

        // Objeto 2: construtor que recebe nome e três notas
        EscolaSENAI aluno2 =
                new EscolaSENAI("Thalita", 20, 25, 20);

        // Exibe o boletim do primeiro aluno
        escola.exibirBoletim();

        System.out.println();

        // Exibe o boletim do segundo aluno
        aluno2.exibirBoletim();
    }
}
