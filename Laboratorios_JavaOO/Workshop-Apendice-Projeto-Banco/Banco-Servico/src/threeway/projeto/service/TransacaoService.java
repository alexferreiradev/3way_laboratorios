package threeway.projeto.service;

import threeway.projeto.modelo.Transacao;
import threeway.projeto.service.Dao.Dao;
import threeway.projeto.service.Dao.TransacaoDao;

public class TransacaoService {

	TransacaoDao dao = new TransacaoDao();
	
	/**
	* Método responsável por retornar instancia de TransacaoDao
	*
	* @return TransacaoDao
	*/
	public TransacaoDao getDao() {
		return dao;
	}
	
	/**
	* Método responsável por por salvar a entidade transação
	*
	* @param transacao
	*/
	public void salvar(Transacao transacao) {
		this.getDao().salvar(transacao);
	}
}
