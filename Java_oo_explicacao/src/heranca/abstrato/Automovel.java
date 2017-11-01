package heranca.abstrato;

public abstract class Automovel {

	protected String modelo;
	protected String cor;

	public Automovel() {
		this.modelo = "modelo padrao";
		this.cor = "cor padrao";
	}

	public Automovel(String modelo, String cor) {
		this.modelo = modelo;
		this.cor = cor;
	}
	
	public void andarFrente() {
		System.out.println("sai da posicao inicial e estou em outra posicao");
	}
	
	public abstract void mover();

	public String getModelo() {
		return modelo;
	}

	public String getCor() {
		return cor;
	}
	
	protected void limparMotor() {
		System.out.println("limpando motor");
	}

}
