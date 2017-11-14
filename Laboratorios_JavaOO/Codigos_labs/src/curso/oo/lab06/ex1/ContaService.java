package curso.oo.lab06.ex1;

public class ContaService {

	public void depositar(Conta contaDestino, double valor) {

		// credita na conta e debita no caixa
		contaDestino.setSaldo(contaDestino.getSaldo() + valor);
	}

	public void sacar(Conta contaSaque, double valor) {

		// debita na conta e credita no caixa
		contaSaque.setSaldo(contaSaque.getSaldo() - valor);
	}

	public void transferir(Conta contaSaque, double valor, Conta contaDestino) {

		// transfere valor da conta para conta destino
		this.sacar(contaSaque, valor);
		this.depositar(contaDestino, valor);
	}

}
