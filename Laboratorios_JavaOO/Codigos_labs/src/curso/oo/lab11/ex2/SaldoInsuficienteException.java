package curso.oo.lab11.ex2;

public class SaldoInsuficienteException extends Exception {

	/** Atributo serialVersionUID. */
	private static final long serialVersionUID = -2692264935862218672L;

	public SaldoInsuficienteException() {

		super("Saldo insuficiente.");
	}

	public SaldoInsuficienteException( String mensagem ) {

		super(mensagem);
	}
}
