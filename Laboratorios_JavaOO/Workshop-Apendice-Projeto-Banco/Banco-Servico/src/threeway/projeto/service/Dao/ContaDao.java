package threeway.projeto.service.Dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import threeway.projeto.modelo.Cliente;
import threeway.projeto.modelo.Conta;

public class ContaDao implements Dao<Conta> {

	private Collection<Conta> contasMemoria = new ArrayList<Conta>();
	
	@Override
	public Conta obter(Serializable identificador) {
		return null;
	}
	
	@Override
	public void alterar(Conta entidade) {}
	
	@Override
	public void salvar(Conta entidade) {
		contasMemoria.add(entidade);
	}
	
	@Override
	public void remover(Conta entidade) {}
	
	@Override
	public Collection<Conta> consultar(Conta entidade) {
		return null;
	}
	
	@Override
	public Collection<Conta> listar() {
		return contasMemoria;
	}

	@Override
	public void reordenar(Collection<Conta> E) {
		contasMemoria = E;
		
	}
}
