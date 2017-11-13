package curso.oo.lab11.ex4;

public class Cliente extends Pessoa implements Comparable<Cliente> {

	private String cpf;

	private String rg;

	public Cliente() {

	}

	public Cliente( String nome ) {

		super(nome);
	}

	public Cliente( String nome, String cpf ) {

		super(nome);

		this.cpf = cpf;
	}

	public String getCpf() {

		return cpf;
	}

	public void setCpf(String cpf) {

		this.cpf = cpf;
	}

	public String getRg() {

		return rg;
	}

	public void setRg(String rg) {

		this.rg = rg;
	}

	@Override
	public String toString() {

		return "Cliente [cpf=" + cpf + ", nome=" + getNome() + "]";
	}

	@Override
	public final void ImprimeNome() {

		System.out.println("Nome do cliente é : " + getNome() + " Nº CPF: " + cpf + " Seu endereco :" + getEndereco());

	}

	/**
	 * Permite comparações, usando para classificar
	 */
	public int compareTo(Cliente o) {

		// comparando somente campo nome
		return getNome().compareTo(o.getNome());
	}

}
