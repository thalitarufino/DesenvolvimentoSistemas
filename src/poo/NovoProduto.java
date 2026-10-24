package poo;

public class NovoProduto { 


    public static void main(String[] args) {

        Produto informatica1 = new Produto();

        //chamar os atributos
        informatica1.loja = "TechInfo";
        informatica1.nome = "Notebook";
        informatica1.preco = 5000.00;
        informatica1.quantidade = 4;
        
        Produto informatica2 = new Produto();
        informatica2.loja = "TechInfo";
        informatica2.nome = "Celular";
        informatica2.preco = 2000.00;
        informatica2.quantidade = 6;
        
        Produto informatica3 = new Produto();
        informatica3.loja = "TechInfo";
        informatica3.nome = "Teclado";
        informatica3.preco = 250.00;
        informatica3.quantidade = 10;

        //chamar os métodos
        informatica1.mostrados();
        informatica1.calculaPreco();
        informatica1.bonus();
        
        informatica2.mostrados();
        informatica2.calculaPreco();
        informatica2.bonus();
        
        informatica3.mostrados();
        informatica3.calculaPreco();
        informatica3.bonus();
        
     
    
    }
}