package curso.oo.lab06.ex3;

import java.util.Scanner;

public class TestaConta {

	public static void main(String[] argv) {

		// objeto para ler dados da console, captura o que for digitado
		Scanner c = new Scanner(System.in);

		// declara e inicializa saldo com valor digitado pelo usuário
		System.out.println("Digite o saldo inicial da conta");
		double saldoConta = c.nextDouble();

		// declara e inicializa o numero da conta digitado pelo usuário
		System.out.println("Digite o numero da conta");
		int numeroConta = c.nextInt();
		
		// Cria uma instância de ContaService onde está presente as operações para Objeto Conta
		ContaService operacoesConta = new ContaService();
 
		// cria uma instância da classe Conta
		Conta conta1 = new Conta();

		// altera valor dos atributos da instância da classe Conta
		conta1.setNumero(numeroConta);
		conta1.setSaldo(saldoConta);

		// Nova instância de Conta para transferência
		Conta conta2 = new Conta();

		// Nova instância de Conta para transferência
		Conta conta3 = new Conta();

		// Mostra dados da instância da classe Conta
		System.out.println("O numero da Conta1 :" + conta1.getNumero());
		System.out.println("O saldo da Conta1 :" + conta1.getSaldo());

		// chamada ao método depositar para adicionar saldo da conta
		System.out.println("Será creditado 100 reais na conta ");
		operacoesConta.depositar(conta1, 100.00);
		System.out.println("Saldo da Conta1  :" + conta1.getSaldo());

		// chamada ao método sacar para debitar no saldo da conta
		System.out.println("Será debitado 56.43 reais na conta ");
		operacoesConta.sacar(conta1, 56.43);
		System.out.println("Saldo da Conta :" + conta1.getSaldo());

		System.out.println("Saldo da Conta 1 :" + conta1.getSaldo());
		System.out.println("Saldo da Conta 2 :" + conta2.getSaldo());
		System.out.println("Saldo da Conta 3 :" + conta3.getSaldo());
		
		// chamada ao método tranferir para retirar o valor de conta1 para conta2
		System.out.println("Transferir 50.00 de conta 1 para conta2 ");
		operacoesConta.transferir(conta1, 50.00, conta2);
		
		System.out.println("Saldo da Conta 1 :" + conta1.getSaldo());
		System.out.println("Saldo da Conta 2 :" + conta2.getSaldo());
		System.out.println("Saldo da Conta 3 :" + conta3.getSaldo());
		
		System.out.println("Transferir 100.23 de conta 2 para conta3 ");
		operacoesConta.transferir(conta2, 100.23, conta3);
		
		System.out.println("Saldo da Conta 1 :" + conta1.getSaldo());
		System.out.println("Saldo da Conta 2 :" + conta2.getSaldo());
		System.out.println("Saldo da Conta 3 :" + conta3.getSaldo());

	}

}
