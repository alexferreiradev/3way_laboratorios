package curso.oo.lab06.ex3;

public class ContaService {

	public void depositar(Conta contaDestino, double valor) {

		// credita na conta e debita no caixa
		contaDestino.setSaldo(contaDestino.getSaldo() + valor);
	}

	public void sacar(Conta contaSaque, double valor) {

		// debita na conta e credita no caixa
		contaSaque.setSaldo(contaSaque.getSaldo() - valor);
	}

	// Para não implementar a mesma regra duplicado este método chama o segundo transferir
	// e informa o limite com valor zero para representando que não possui saldo.
	public void transferir(Conta contaSaque, double valor, Conta contaDestino) {

		// transfere valor da conta para a conta destino
		transferir(contaSaque, valor, contaDestino, 0);
	}

	// Sobrecarga do método com argumentos diferentes, quando for invocado este método
	// deverá ser informado um valor para limite (cheque especial) que será adicionado ao
	// saldo da conta para verificar se pode ocorrer a transferência.
	public void transferir(Conta contaSaque, double valor, Conta contaDestino, double limite) {

		if (( contaSaque.getSaldo() + limite ) < valor) {
			System.out.print("Saldo insuficiente para esta operação");
			return;
		}
		// transfere valor da conta para conta destino
		this.sacar(contaSaque, valor);
		this.depositar(contaDestino, valor);
	}

}
