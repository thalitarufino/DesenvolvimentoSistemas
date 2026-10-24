package pooexercicios;

public class ContaBancariaCurso {
		String titular;
		double saldo;
		
		// parametro dentro do metodo
		// lembrando o void n retorna pq ele é um metodo vazio
		
		public ContaBancariaCurso(String titular, double saldo) {
			
			this.titular = titular;
			this.saldo = saldo;
			
		}
		
		//metodo exibir
		void exibirSaldo() {
			System.err.println("=====BANCO=====");
			System.out.println("TITULAR: " + this.titular+"|Saldo: " + this.saldo);
			System.out.println("===========");		
		}
		
		//metodo depositar
		void depositar(double valor) {
		saldo = saldo + valor;
		System.out.println("Depósito realizado");
		System.out.println("Valor do Deposito: "+valor);	
		System.out.println("Titular da conta: "+this.titular);
		
		} 
		// o metodo sacar 
		void sacar (double valor) {
			
		 //saldo  = saldo - valor	
		if (valor > 0 && valor <= this.saldo) {
		  this.saldo -= valor;//saldo = saldo - valor
		  System.out.println("Valor Sacado: "+valor);
		}else {
			System.out.println("Saldo Insuficiente! ");
			{}}
				
			}
			// (destinado) minha variavel do tipo da minha classe modelo (ContaBancaria)
		    // q vai ser somada mas com o valor 
			void transferir(ContaBancariaCurso destinado, double valor) {
	        //uma conta de destina e um valor a ser recebido
			    if (valor > 0 && valor <= this.saldo) {

			        this.saldo -= valor;
			        destinado.saldo += valor;
	// destinado ao saldo menos o valor
			        
			        System.out.println("Transferência realizada!");
			        System.out.println("Conta de origem: " + this.titular);
			        System.out.println("Conta de destino: " + destinado.titular);
			        System.out.println("Valor transferido: R$ " + valor);

			    } else {
			 
			    	System.out.println("Saldo insuficiente ou valor inválido!");
			    }
			    
			}  
		
		}