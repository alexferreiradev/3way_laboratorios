package curso.oo.lab10.ex1;

public class SaldoInsuficienteException extends Exception {

	public SaldoInsuficienteException() {

		super("Saldo insuficiente.");
	}

	public SaldoInsuficienteException( String mensagem ) {

		super(mensagem);
	}
}
