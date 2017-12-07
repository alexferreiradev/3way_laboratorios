package threeway.projeto.service.excecoes;

public class RgJaCadastradoException extends Exception{
	
	
	public RgJaCadastradoException() {
		super("RG ja cadastrado.");
	}
	
	public RgJaCadastradoException(String mensagem) {
		super(mensagem);
	}

}
