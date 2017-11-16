package curso.oo.lab06.ex3;

public class SobrecargaTransferir {

	public static void main(String[] argv) {

		// Cria uma instância de ContaService onde está presente as operações para Objeto Conta
		ContaService operacoesConta = new ContaService();

		// cria uma instância da classe Conta
		Conta conta1 = new Conta();

		// configura instância da classe Conta
		conta1.setNumero(1234567890);
		conta1.setSaldo(500.00);

		// cria nova instancia de Conta para tranferencia
		Conta conta2 = new Conta();
		conta2.setSaldo(50.00);

		// cria nova instancia de Conta para tranferencia
		Conta conta3 = new Conta();

		System.out.println("Transferir 400.00 de conta 1 para conta2 ");

		// tranferindo valor de conta1 para conta2 utilizando transferencia sem limite
		operacoesConta.transferir(conta1, 400.00, conta2);
		System.out.println("Saldo da Conta 1:" + conta1.getSaldo());
		System.out.println("Saldo da Conta 2:" + conta2.getSaldo());
		System.out.println("Saldo da Conta 3:" + conta3.getSaldo());

		// tranferindo valor de conta1 para conta2 utilizando transferencia com limite
		operacoesConta.transferir(conta1, 200.00, conta2, 300);
		System.out.println("Saldo da Conta 1:" + conta1.getSaldo());
		System.out.println("Saldo da Conta 2:" + conta2.getSaldo());
		System.out.println("Saldo da Conta 3:" + conta3.getSaldo());

		System.out.println("Transferir 100.00 de conta 2 para conta3 ");

		//todo - use o metodo transferir para transferir 100 reais da conta 2 para 3
		// tranferindo valor de conta1 para conta2 utilizando transferencia sem limite
		
		System.out.println("Saldo da Conta 1:" + conta1.getSaldo());
		System.out.println("Saldo da Conta 2:" + conta2.getSaldo());
		System.out.println("Saldo da Conta 3:" + conta3.getSaldo());

		System.out.println("Transferir 100.23 de conta 2 para conta3 ");

		//todo - transfira agora, usando o metodo com limite, colocando limite de 600 reais
		// tranferindo valor de conta2 para conta3 utilizando transferencia com limite
		
		System.out.println("Saldo da Conta 1:" + conta1.getSaldo());
		System.out.println("Saldo da Conta 2:" + conta2.getSaldo());
		System.out.println("Saldo da Conta 3:" + conta3.getSaldo());
	}

}
