package poo;
public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

     void exibirSaldo() {
        System.out.println("=====BANCO=====");
        System.out.println("TITULAR: " + titular + " | Saldo: " + saldo);
        System.out.println("===========");
    }

     void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado");
        System.out.println("Valor do Deposito: " + valor);
        System.out.println("Saldo: " + saldo);
    }

     void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Titular da conta: " + titular);
            System.out.println("Valor Sacado: " + valor);
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }

    public void transferir(ContaBancaria destinado, double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            destinado.saldo += valor;
            System.out.println("Transferência realizada!");
            System.out.println("Conta de origem: " + titular);
            System.out.println("Conta de destino: " + destinado.titular);
            System.out.println("Valor transferido: R$ " + valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }
}
