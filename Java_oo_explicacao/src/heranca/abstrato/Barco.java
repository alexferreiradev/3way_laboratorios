package heranca.abstrato;

public class Barco extends Automovel {

	public Barco() {
		// TODO Auto-generated constructor stub
	}

	public Barco(String modelo, String cor) {
		super(modelo, cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mover() {
		System.out.println("Navegar");		
	}

}
