package heranca;

public class Carro extends Automovel {

	public Carro() {
		this.modelo = "Carro e nao moto";
		limparMotor();
	}

	public Carro(String modelo, String cor) {
		super(modelo, cor);
	}

}
