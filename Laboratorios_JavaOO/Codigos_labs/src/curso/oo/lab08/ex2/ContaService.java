package curso.oo.lab08.ex2;

public class ContaService {

	public void depositar(Conta contaDestino, double valor) {

		// credita na conta e debita no caixa
		contaDestino.setSaldo(contaDestino.getSaldo() + valor);

		this.historicoTransacao(null, contaDestino, valor, "deposito na conta " + contaDestino.getNumero(), EnumTipoTransacao.DEPOSITO);
	}

	public void sacar(Conta contaSaque, double valor) {

		// debita na conta e credita no caixa
		contaSaque.setSaldo(contaSaque.getSaldo() - valor);

		this.historicoTransacao(null, contaSaque, valor, "saque na conta " + contaSaque.getNumero(), EnumTipoTransacao.DEPOSITO);
	}

	// método sobrecarregado, transfere dados desta conta (this) para outra
	public boolean transferir(Conta contaSaque, double valor, Conta contaDestino) {

		return transferir(contaSaque, valor, contaDestino, "transferencia para conta " + contaDestino.getNumero());
	}

	// método sobrecarregado, transfere valor desta conta (this) para outra conta e registra a transação
	public boolean transferir(Conta contaSaque, double valor, Conta contaDestino, String descr) {

		if (contaSaque.getSaldo() - valor >= 0) {

			this.debito(contaSaque, valor);

			this.credito(contaDestino, valor);

			this.historicoTransacao(contaSaque, contaDestino, valor, descr, EnumTipoTransacao.TRANSFERENCIA);

			return true;

		} else {

			return false;
		}

	}

	// subtrai valor do saldo
	protected void debito(Conta contaOperacao, double valor) {

		contaOperacao.setSaldo(contaOperacao.getSaldo() - valor);

	}

	// adiciona valor ao saldo
	protected void credito(Conta contaOperacao, double valor) {

		contaOperacao.setSaldo(contaOperacao.getSaldo() + valor);

	}

	// cria um objeto transação e registra adicionando no movimento da conta
	protected void historicoTransacao(Conta contaDebito, Conta contaCredito, double valor, String descr, EnumTipoTransacao tipoTransacao) {

		Transacao transacao = new Transacao(UtilData.data(), contaDebito, contaCredito, valor, descr, tipoTransacao);

		if (contaDebito != null) {
			
			contaDebito.getMovimento().add(transacao);
			
		}
		
		contaCredito.getMovimento().add(transacao);
	}

}
