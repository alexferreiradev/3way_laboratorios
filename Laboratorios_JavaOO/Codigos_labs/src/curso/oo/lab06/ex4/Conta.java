package curso.oo.lab06.ex4;

import java.util.Date;

public class Conta {

	private int numero;

	private String titular;

	private double saldo;

	private Date dataAbertura;

	public Conta() {

		this.dataAbertura = new Date();

		System.out.println("Data de abertura da Conta e : " + this.dataAbertura.toString());
	}

	// construtor com dois parametros
	public Conta( String nome, int nconta ) {
		this();
		numero = nconta;
		titular = nome;
		saldo = 0.0; // Conta em reais e zerada
	}

	public void depositar(double valor) {

		// credita na conta e debita no caixa
		saldo += valor;
	}

	public void sacar(double valor) {

		// debita na conta e credita no caixa
		saldo -= valor;
	}

	// Para não implementar a mesma regra duplicado este método chama o segundo transferir
	// e informa o limite com valor zero para representando que não possui saldo.
	public void transferir(double valor, Conta destino) {

		// transfere valor da conta para a conta destino
		transferir(valor, destino, 0);
	}

	// Sobrecarga do método com argumentos diferentes, quando for invocado este método
	// deverá ser informado um valor para limite (cheque especial) que será adicionado ao
	// saldo da conta para verificar se pode ocorrer a transferência.
	public void transferir(double valor, Conta destino, double limite) {

		if (( saldo + limite ) < valor) {
			System.out.print("Saldo insuficiente para esta operação");
			return;
		}
		this.sacar(valor);
		destino.depositar(valor);
	}

	public int getNumero() {

		return numero;
	}

	public void setNumero(int numero) {

		this.numero = numero;
	}

	public String getTitular() {

		return titular;
	}

	public void setTitular(String titular) {

		this.titular = titular;
	}

	public double getSaldo() {

		return saldo;
	}

	public void setSaldo(double saldo) {

		this.saldo = saldo;
	}

	public Date getDataAbertura() {

		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {

		this.dataAbertura = dataAbertura;
	}

}
