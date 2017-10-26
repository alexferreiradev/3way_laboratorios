package teste;

public class Carro {
	private String modelo = "";
	private String marca = "";
	private String cor = "";
	
	public Carro() {
	}
	
	public Carro(String marca, String cor) {
		this.marca = marca;
		this.cor = cor;
	}
	
	public Carro(String modelo, String marca, String cor) {
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
	}
	
	private void ligar() {
		System.out.println("Ligando carro");
	}
	
	public void ligarChave() {
		System.out.println("Girando chave");
		ligar();
		System.out.println("Carro ligado com chave");
	}
	
	public String getModelo() {
		return this.modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}	
}
