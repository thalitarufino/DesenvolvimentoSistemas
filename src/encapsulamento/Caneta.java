package encapsulamento;

public class Caneta {
	// atributos
	private String modelo;
	public String cor;
	public float ponta;
	protected int carga;
	protected boolean tampada;

	public Caneta(String modelo, String cor, float ponta, int carga) {
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.carga = carga;

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro Não posso rabiscar");
		} else {
			System.out.println("Estou rabiscando");
		}
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	// métodos
	public void status() {
		System.out.println("SOBRE A CANETA: ");
		System.out.println("Modelo: " + getModelo());
		System.out.println("Uma caneta " + getCor());
		System.out.println("Ponta: " + getPonta());
		System.out.println("Carga: " + getCarga());
		System.out.println("Está tampada? " + this.tampada);
	}
}