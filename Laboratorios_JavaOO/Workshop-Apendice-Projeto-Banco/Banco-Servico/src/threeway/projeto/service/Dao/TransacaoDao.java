package threeway.projeto.service.Dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import threeway.projeto.modelo.Transacao;

public class TransacaoDao implements Dao<Transacao> {

	private Collection<Transacao> transacoesMemoria = new ArrayList<Transacao>();
	
	@Override
	public Transacao obter(Serializable identificador) {
		return null;
	}
	
	@Override
	public void alterar(Transacao entidade) {}
	
	@Override
	public void salvar(Transacao entidade) {
		this.transacoesMemoria.add(entidade);
	}
	
	@Override
	public void remover(Transacao entidade) {}
	
	@Override
	public Collection<Transacao> consultar(Transacao entidade) {
		return null;
	}
	
	@Override
	public Collection<Transacao> listar() {
		return transacoesMemoria;
	}

	@Override
	public void reordenar(Collection<Transacao> E) {
		transacoesMemoria = E;
		
	}
}