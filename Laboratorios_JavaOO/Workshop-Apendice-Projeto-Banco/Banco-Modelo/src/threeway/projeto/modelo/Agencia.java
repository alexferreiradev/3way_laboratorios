package threeway.projeto.modelo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Agencia {
	private Long identificador;
	private String nome;
	private Banco banco;
	private Collection<Conta> contas;

	public Agencia( String nome ) {
		this.nome = nome;
		contas = new HashSet<Conta>();
	}
	
	public Agencia( String nome, Banco banco ) {
		this(nome);
		this.banco = banco;
	}
	
	@Override
	public boolean equals(Object objeto) {
		boolean resultado = false;
		if (( objeto != null ) && ( objeto instanceof Agencia )) {
			Agencia c = (Agencia) objeto;
			if (nome == c.nome) {
				resultado = true;
			}
		}
		return resultado;
	}

	/*@Override
	public int hashCode() {
		return Integer.parseInt(nome);
	}*/

	@Override
	public String toString() {
		return nome;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
		
	}

	public String getNome() {
		return nome;
	}

	public Banco getBanco() {
		return banco;
	}
}