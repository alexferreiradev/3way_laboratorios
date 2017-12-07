package threeway.projeto.service.excecoes;

public class CPFJaCadastradoException extends Exception{
	
	
	public CPFJaCadastradoException() {
		super("CPF ja cadastrado.");
	}
	
	public CPFJaCadastradoException(String mensagem) {
		super(mensagem);
	}

}
