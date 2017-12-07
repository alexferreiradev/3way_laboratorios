package threeway.projeto.service.excecoes;


public class SaldoInsuficienteException extends Exception{
	
	
	public SaldoInsuficienteException() {
		super("Saldo Insuficiente.");
	}
	
	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}
}
