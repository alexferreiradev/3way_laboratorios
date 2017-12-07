package threeway.projeto.service.excecoes;

public class NumeroDeContaJaExistenteException extends Exception{
	
	
	public NumeroDeContaJaExistenteException() {
		super("Numero de conta ja existente.");
	}
	
	public NumeroDeContaJaExistenteException(String mensagem) {
		super(mensagem);
	}

}
