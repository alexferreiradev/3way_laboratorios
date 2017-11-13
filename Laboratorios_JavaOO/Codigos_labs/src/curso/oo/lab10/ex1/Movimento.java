package curso.oo.lab10.ex1;

import java.util.*;

/**
 * Classe que implementa um movimento de transacoes. 
 * Um movimento é apenas uma serie de transacoes feitas. 
 * Todas as transacoes devem entrar aqui em ordem cronologica.
 */
public class Movimento<T> {

	// uma colecao deve manter a ordem de inserçao
	private ArrayList<T> transacoes;

	// Construtores
	/**
	 * Controi um Movimento vazio (sem transacoes).
	 */
	public Movimento() {

		this.transacoes = new ArrayList<T>();
	}

	/**
	 * Adiciona uma transacoes ao movimento.
	 */
	public void add(T transacao) {

		transacoes.add(transacao);
	}

	/**
	 * Fornece um Iterator para varrer as transacoes por data.
	 */
	public Iterator<T> getTransacoes() {

		return transacoes.iterator();
	}
}
