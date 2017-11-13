package curso.oo.lab09.ex1;

public class MovimentoContaCorrente {

	public static void main(String[] args) {

		// Cria uma instância de ContaService onde está presente as operações para Objeto Conta
		ContaService operacoesConta = new ContaService();

		Conta correntista1 = new Conta("Aluno", 1001);
		Conta correntista2 = new Conta("Aluna", 21);

		// faz deposito
		operacoesConta.depositar(correntista1, 100);

		// faz Transferencia proibida
		try {
			operacoesConta.transferir(correntista1, 600, correntista2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// faz Transferencia autorizada
		try {
			operacoesConta.transferir(correntista1, 99.00, correntista2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		ExtratoTXT movimento = new ExtratoTXT(correntista1);
		System.out.println(movimento.formatar());
	}

}
