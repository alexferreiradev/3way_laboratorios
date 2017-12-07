package threeway.projeto.service;

import java.util.ArrayList;

import threeway.projeto.modelo.Cliente;
import threeway.projeto.service.Dao.ClienteDao;
import threeway.projeto.service.excecoes.CamposObrigatoriosException;
import threeway.projeto.service.excecoes.RgJaCadastradoException;
import threeway.projeto.service.excecoes.CPFJaCadastradoException;

public class ClienteService {

	private ClienteDao dao = new ClienteDao();
	
	/**
	* Método responsável por Atualizar entidade cliente
	*
	* @param cliente
	*
	* @throws CamposObrigatoriosException
	*/
	public void atualizar(Cliente cliente) throws CamposObrigatoriosException , RgJaCadastradoException{
		this.validarCamposObrigatorios(cliente);
		this.getDao().alterar(cliente);
	}
	
	/**
	* Método responsável por excluir entidade cliente
	*
	* @param cliente
	*/
	public void excluir(Cliente cliente) {
		this.getDao().remover(cliente);
	}
	
	/**
	* Método responsável por listar todos os clientes
	*
	* @return ArrayList<Cliente>
	*/
	
	public ArrayList<Cliente> listarTodosClientes() {
		return new ArrayList<Cliente>(this.getDao().listar());
	}
	
	/**
	* Método responsável por salvar a entiade cliente
	*
	* @param cliente
	*
	* @throws CamposObrigatoriosException
	*/
	public void salvar(Cliente cliente) throws CamposObrigatoriosException, CPFJaCadastradoException, RgJaCadastradoException{
		this.validarCamposObrigatorios(cliente);
		this.validarCpfRepetido(cliente);
		this.validarRgRepetido(cliente);
		this.getDao().salvar(cliente);
	}
	
	/**
	* Método responsável por validar campos obrigatorios Nome e CPF de cliente
	*
	* @param cliente
	*
	* @throws CamposObrigatoriosException
	*/
	private void validarCamposObrigatorios(Cliente cliente) throws CamposObrigatoriosException {
		if (cliente == null || cliente.getNome().equals("") || cliente.getCpf().replace("-", "").replace(".", "").trim().equals("")) {
			throw new CamposObrigatoriosException();
		}
	}
	
	private void validarCpfRepetido(Cliente cliente) throws CPFJaCadastradoException{
		for(Cliente entidade : getDao().listar()){
			if(entidade.getCpf().equals(cliente.getCpf())){
				throw new CPFJaCadastradoException();
			}
		}
	}
	private void validarRgRepetido(Cliente cliente) throws RgJaCadastradoException{
		for(Cliente entidade : getDao().listar()){
			if(entidade.getRg().equals(cliente.getRg())){
				throw new RgJaCadastradoException();
			}
		}
	}
	
	/**
	* Método responsável por retornar a instancia de ClienteDao
	*
	* @return
	*/
	public ClienteDao getDao() {
		return dao;
	}
	
	public void reordenaTable(){
		getDao().reordenar(getDao().listar());
	}
}
