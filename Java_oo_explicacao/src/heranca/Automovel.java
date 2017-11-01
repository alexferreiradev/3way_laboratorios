package heranca;

public class Automovel {

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
		
	}

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
