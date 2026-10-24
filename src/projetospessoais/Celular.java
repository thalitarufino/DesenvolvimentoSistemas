package projetospessoais;

public class Celular {
	public String marca;
	protected String modelo;
	protected int memoria;
	private boolean ligado;

	public Celular(String marca, String modelo, int memoria) { // contrutor com PARAMETRO
		this.marca = marca;
		this.modelo = modelo;
		this.memoria = memoria;
		this.ligado = false;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public boolean isLigado(boolean ligado) {
		return ligado;
	}

	public void ligado() {
		this.ligado = true;
	}

	public void desligado() {
		this.ligado = false;
	}

	public boolean isLigado() {
		return ligado;
	}

	void status() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Memória: " + memoria + " GB");
		System.out.println("Ligado: " + ligado);

	}
}
