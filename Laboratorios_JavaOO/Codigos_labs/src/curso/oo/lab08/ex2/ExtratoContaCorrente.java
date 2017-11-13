package curso.oo.lab08.ex2;

public class ExtratoContaCorrente {

	public static void main(String[] args) {

		// Cria uma instância de ContaService onde está presente as operações para Objeto Conta
		ContaService operacoesConta = new ContaService();

		Conta correntista1 = new Conta("Aluno", 1001);

		Conta correntista2 = new Conta("Professor", 2002);

		// faz deposito
		operacoesConta.depositar(correntista1, 1000);

		// faz transferencia de correntista1 para correntista2 e salva em memoria a transação
		operacoesConta.transferir(correntista1, 450.00, correntista2);

		// faz transferencia de correntista1 para correntista2 e salva em memoria a transação
		operacoesConta.transferir(correntista2, 50.00, correntista1);

		IExtrato movimento = new ExtratoTXT(correntista1);
		System.out.println(movimento.formatar());

		IExtrato movimento1 = new ExtratoHTML(correntista1);
		System.out.println(movimento1.formatar());
	}

}
