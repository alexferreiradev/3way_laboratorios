package heranca.abstrato;

public class Carro extends Automovel {

	public Carro() {
		this.modelo = "Carro e nao moto";
		limparMotor();
	}

	public Carro(String modelo, String cor) {
		super(modelo, cor);
	}

	@Override
	public void mover() {
		System.out.println("Corre");
	}

	@Override
	public void andarFrente() {
		super.andarFrente();
		System.out.println("Andar para frente do carro");
	}

}
