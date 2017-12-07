package threeway.projeto.modelo;

import java.util.Collection;
import java.util.HashSet;

public class Banco {
	private Long identificador;
	private int numero;
	private String nome;
	private Collection<Agencia> agencias;
	
	public Banco(){
		agencias = new HashSet<Agencia>();
	}
	
	//get e set
	public Collection<Agencia> getAgencias() {
		return agencias;
	}

	public void setNome(String nome) {
		this.nome = nome;		
	}
	
	public String getNome(){
		return nome;
	}

}