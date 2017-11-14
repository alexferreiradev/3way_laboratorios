package curso.oo.lab11.ex5;

import java.util.Collection;

public class Banco extends EntidadeBanco implements Comparable<Banco> {

	private Long identificador;

	private Integer numero;

	private String nome;

	private Collection<Agencia> agencias;

	public Banco( Integer numero ) {

		this.numero = numero;
	}

	public Long getIdentificador() {

		return identificador;
	}

	public void setIdentificador(Long identificador) {

		this.identificador = identificador;
	}

	public Integer getNumero() {

		return numero;
	}

	public void setNumero(Integer numero) {

		this.numero = numero;
	}

	public Collection<Agencia> getAgencias() {

		return agencias;
	}

	public void setAgencias(Collection<Agencia> agencias) {

		this.agencias = agencias;
	}

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {

		this.nome = nome;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + ( ( nome == null ) ? 0 : nome.hashCode() );
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banco other = (Banco) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {

		return "Banco [numero=" + numero + ", nome=" + nome + "]";
	}

	@Override
	public int compareTo(Banco o) {

		// comparando somente campo nome
		return getNumero().compareTo(o.getNumero());
	}

}
