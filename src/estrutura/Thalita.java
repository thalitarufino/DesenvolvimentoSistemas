package estrutura;

public class Thalita {
/*
 *
MOSTRAR INFORMACOES: print, println e printf

System.out.printf("Nome: %s%n", nome);
System.out.printf("Idade: %d%n", idade);
System.out.printf("Nota: %.2f%n", nota);

// Codigos comuns do printf:
// %s = texto (String)
// %d = inteiro (int)
// %f = decimal (float/double)
// %.2f = decimal com 2 casas depois da virgula
// %n = quebra de linha
// Exemplo:
System.out.printf("%s tem %d anos e nota %.1f%n", nome, idade, nota);


ENTRADA DE DADOS COM SCANNER
------------------------------------------------------------
import java.util.Scanner;
        Scanner leitor = new Scanner(System.in);
        int idade = leitor.nextInt();
        leitor.close();
    }
}

Metodos comuns:
- nextInt()       le um int
- nextDouble()    le um double
- next()          le uma palavra, ate o espaco
- nextLine()      le uma linha inteira
- nextBoolean()   le true ou false

CUIDADO com nextInt() seguido de nextLine():
int idade = leitor.nextInt();
leitor.nextLine(); // consome a quebra de linha pendente
System.out.print("Digite seu nome completo: ");
String nome = leitor.nextLine();

ENTRADA E SAIDA COM JOptionPane
------------------------------------------------------------
import javax.swing.JOptionPane;
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String textoIdade = JOptionPane.showInputDialog("Digite sua idade:");
        int idade = Integer.parseInt(textoIdade);
        JOptionPane.showMessageDialog(null, "Ola, " + nome);
        JOptionPane.showMessageDialog(null, "Idade: " + idade);
    }
}
Importante:
- showInputDialog retorna String.
- Para converter texto em inteiro: Integer.parseInt(texto)
- Para converter texto em decimal: Double.parseDouble(texto)
- showMessageDialog mostra uma mensagem.
Exemplo de conta:
String texto = JOptionPane.showInputDialog("Digite um numero:");
double numero = Double.parseDouble(texto);
JOptionPane.showMessageDialog(null, "Dobro: " + (numero * 2));

6OPERADORES ARITMETICOS
------------------------------------------------------------
int a = 10, b = 3;

a + b   // soma: 13
a - b   // subtracao: 7
a * b   // multiplicacao: 30
a / b   // divisao inteira: 3, porque ambos sao int
a % b   // resto da divisao: 1

double resultado = 10.0 / 3; // divisao decimal

Atalhos:
x += 2;  // x = x + 2
x -= 2;  // x = x - 2
x *= 2;  // x = x * 2
x /= 2;  // x = x / 2

 INCREMENTO E DECREMENTO
------------------------------------------------------------
int x = 5;
x++;  // x passa a 6 (incrementa 1)
x--;  // x volta a 5 (decrementa 1)

++x e x++:
int a = 5;
int b = a++; // b recebe 5; depois a passa a 6

int c = 5;
int d = ++c; // c passa a 6; d recebe 6

Em um for, i++ costuma significar avancar para a proxima repeticao.

. OPERADORES DE COMPARACAO E LOGICOS
------------------------------------------------------------
&&   // E: as duas condicoes precisam ser verdadeiras
||   // OU: pelo menos uma precisa ser verdadeira
!    // NAO: inverte true/false
ATENCAO: para comparar valores primitivos use ==.
Para comparar Strings, geralmente use nome.equals("Ana"), nao nome == "Ana".

IF, ELSE IF E ELSE
------------------------------------------------------------
int nota = 7;
Exemplo com mais de duas opcoes:
if (nota >= 9) {
    System.out.println("Excelente");
} else if (nota >= 7) {
    System.out.println("Aprovado");
} else if (nota >= 5) {
    System.out.println("Recuperacao");
} else {
    System.out.println("Reprovado");
}

SWITCH
------------------------------------------------------------
int opcao = 2;

switch (opcao) {
    case 1:
        System.out.println("Cadastrar");
        break;
    case 2:
        System.out.println("Consultar");
        break;
    default:
        System.out.println("Opcao invalida");
}

 REPETICAO: FOR
------------------------------------------------------------
for (int i = 0; i < 5; i++) {
}

REPETICAO: WHILE
------------------------------------------------------------
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
REPETICAO: DO-WHILE
------------------------------------------------------------
int numero;
do {
    System.out.print("Digite um numero positivo: ");
    numero = leitor.nextInt();
} while (numero <= 0);

O do-while executa pelo menos uma vez, pois verifica a condicao no final.

VETORES (ARRAYS UNIDIMENSIONAIS)
------------------------------------------------------------

public class VetorArrays2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		// Criamos APENAS UM vetor com 8 posicoes
		int[] vetor1 = new int[8];

		// Este for serve para receber os 8 numeros
		for (int i = 0; i < 8; i++) {

			// Pede um numero ao usuario
			System.out.println("Informe o " + (i + 1) + " valor:");

			// Guarda o numero digitado dentro do vetor
			// Exemplo: vetor1[0], vetor1[1], vetor1[2]...
			vetor1[i] = leitor.nextInt();
		}

		// O maior comeca sendo o primeiro numero do vetor
		int maior = vetor1[0];

		// O menor tambem comeca sendo o primeiro numero
		int menor = vetor1[0];

		// Este segundo for percorre os numeros ja guardados
		// Comecamos em 1 porque a posicao 0 ja foi usada
		for (int i = 1; i < 8; i++) {

			// Se o numero atual for maior que o maior,
			// atualizamos a variavel maior
			if (vetor1[i] > maior) {
				maior = vetor1[i];
			}

			// Se o numero atual for menor que o menor,
			// atualizamos a variavel menor
			if (vetor1[i] < menor) {
				menor = vetor1[i];
			}
		}

		// Mostra o maior numero encontrado
		System.out.println("Maior numero: " + maior);

		// Mostra o menor numero encontrado
		System.out.println("Menor numero: " + menor);

		// Fecha o Scanner
		leitor.close();
	}
}

15. MATRIZES (ARRAYS BIDIMENSIONAIS)
------------------------------------------------------------
Uma matriz guarda valores em linhas e colunas.

int[][] matriz = new int[3][2];
// 3 linhas e 2 colunas

Ou:
int[][] matriz2 = {
    {1, 2},
    {3, 4},
    {5, 6}
};

Acessar:
matriz2[0][0] // 1: primeira linha, primeira coluna
matriz2[1][0] // 3: segunda linha, primeira coluna
matriz2[2][1] // 6: terceira linha, segunda coluna

matriz2.length        // quantidade de linhas
matriz2[0].length     // quantidade de colunas da primeira linha

Preencher e mostrar matriz:
Scanner leitor = new Scanner(System.in);
int[][] matriz = new int[3][2];

for (int linha = 0; linha < matriz.length; linha++) {
    for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
        System.out.print("Digite o valor: ");
        matriz[linha][coluna] = leitor.nextInt();
    }
}

for (int linha = 0; linha < matriz.length; linha++) {
    for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
        System.out.print(matriz[linha][coluna] + " ");
    }
    System.out.println();
}

Somar todos os valores da matriz:
int soma = 0;
for (int linha = 0; linha < matriz.length; linha++) {
    for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
        soma += matriz[linha][coluna];
    }
}
System.out.println("Soma: " + soma);

DIFERENCA ENTRE VETOR E MATRIZ
------------------------------------------------------------
Vetor:
int[] numeros = new int[5];
Usa um indice: numeros[i]

Matriz:
int[][] tabela = new int[3][4];
Usa dois indices: tabela[linha][coluna]

METODOS
------------------------------------------------------------
Um metodo e um bloco de codigo que executa uma tarefa.

public static void mostrarMensagem() {
    System.out.println("Ola!");
}

Para chamar:
mostrarMensagem();

Metodo que recebe parametros:
public static void cumprimentar(String nome) {
    System.out.println("Ola, " + nome);
}
// Chamada:
cumprimentar("Carlos");

Metodo que retorna valor:
public static int somar(int a, int b) {
    return a + b;
}
// Chamada:
int resultado = somar(3, 4);
System.out.println(resultado); // 7

- void: nao retorna um valor.
- return: devolve um resultado.
- Parametros: dados recebidos pelo metodo.

PROGRAMACAO ORIENTADA A OBJETOS (POO)
------------------------------------------------------------
Classe = molde.
Objeto = instancia criada a partir da classe.
Atributos = caracteristicas/variaveis do objeto.
Metodos = comportamentos/acoes do objeto.
Construtor = prepara/inicializa o objeto.

Exemplo de classe:
public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Meu nome e " + nome);
        System.out.println("Minha idade e " + idade);
    }
}

Criar e usar objeto em outra classe:
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana", 20);
        p1.apresentar();
    }
}

Explicacao:
- Pessoa e a classe.
- p1 e a variavel que referencia o objeto.
- new Pessoa(...) cria o objeto.
- this.nome refere-se ao atributo do objeto atual.
- apresentar() e um metodo.

CONSTRUTORES
------------------------------------------------------------
public class Aluno {
    String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }
}

Uso:
Aluno a = new Aluno("Joao");

O construtor tem o mesmo nome da classe e nao tem tipo de retorno.
 CONVERSAO DE TIPOS
------------------------------------------------------------
String texto = "123";
int numero = Integer.parseInt(texto);

String decimalTexto = "7.5";
double valor = Double.parseDouble(decimalTexto);

int x = 10;
double y = x; // conversao automatica de int para double

double preco = 9.99;
int inteiro = (int) preco; // vira 9: perde a parte decimal

EXEMPLO COMPLETO: MEDIA DE 3 NOTAS COM SCANNER
------------------------------------------------------------
import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = leitor.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double n3 = leitor.nextDouble();

        double media = (n1 + n2 + n3) / 3.0;

        System.out.printf("Media: %.2f%n", media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        leitor.close();
    }
}

26. ERROS COMUNS NA PROVA
------------------------------------------------------------
- Esquecer ponto e virgula.
- Esquecer chaves { }.
- Escrever System.out.print de forma incorreta.
- Usar = quando queria comparar com ==.
- Usar == para comparar o conteudo de Strings; prefira .equals().
- Acessar vetor fora do limite: vetor[5] em vetor de tamanho 5.
  Indices validos: 0 a 4.
- Usar vetor[i] antes de preencher os valores.
- Iniciar maior e menor com 0, o que falha se todos os valores forem positivos/negativos em certos casos.
- Esquecer de atualizar i em while, criando repeticao infinita.
- Confundir = (atribuicao) com == (comparacao).
- Em matriz, esquecer que primeiro indice e linha e segundo e coluna.
- Esquecer import java.util.Scanner; ou import javax.swing.JOptionPane;.
- O nome da classe public deve combinar com o arquivo.

MINI LISTA PARA TREINAR
------------------------------------------------------------
1. Leia 5 numeros e mostre a soma.
2. Leia 8 numeros e encontre o maior e o menor.
3. Leia 6 notas e calcule a media.
4. Crie uma matriz 3x3 e mostre todos os valores.
5. Some todos os valores de uma matriz.
6. Mostre a diagonal principal de uma matriz 3x3.
7. Crie uma classe Pessoa com nome e idade e um metodo apresentar().
8. Use JOptionPane para pedir nome e idade e mostrar uma mensagem.
9. Use for para mostrar numeros de 1 a 10.
10. Use if/else para dizer se um numero e par ou impar.

Par ou impar:
int numero = 8;
if (numero % 2 == 0) {
    System.out.println("Par");
} else {
    System.out.println("Impar");
}

 */
}
