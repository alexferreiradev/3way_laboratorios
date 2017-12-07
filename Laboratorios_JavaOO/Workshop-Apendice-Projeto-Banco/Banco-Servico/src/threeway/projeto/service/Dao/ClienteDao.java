package threeway.projeto.service.Dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import threeway.projeto.modelo.Cliente;

public class ClienteDao implements Dao<Cliente> {

	private Collection<Cliente> clientesMemoria = new ArrayList<Cliente>();
	
	@Override
	public Cliente obter(Serializable identificador) {
		return null;
	}
	
	
	@Override
	public void alterar(Cliente entidade) {
		for (Cliente cliente : clientesMemoria) {
			System.out.println("Buscando...");
			System.out.println("Ent CPF = "+entidade.getCpf()+"   Cl CPF = "+cliente.getCpf());
			if (entidade.getCpf().equals(cliente.getCpf())) {
				clientesMemoria.remove(cliente);
				clientesMemoria.add(entidade);
				System.out.println("achou e removeu");
				break;
			}
		}
	}
	
	@Override
	public void salvar(Cliente entidade) {
		this.clientesMemoria.add(entidade);
	}
	
	@Override
	public void remover(Cliente entidade) {
		this.clientesMemoria.remove(entidade);
	}
	
	@Override
	public Collection<Cliente> consultar(Cliente entidade) {
		return null;
	}
	
	@Override
	public Collection<Cliente> listar() {
		return this.clientesMemoria;
	}


	@Override
	public void reordenar(Collection<Cliente> E) {
		clientesMemoria = E;
		
	}
}
