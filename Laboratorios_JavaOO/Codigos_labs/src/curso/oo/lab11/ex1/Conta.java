package curso.oo.lab11.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Conta extends EntidadeBanco {

	private Long identificador;

	private int numero;

	private double saldo;

	private Date dataAbertura;

	private Collection<Transacao> transacoes;

	private Cliente titular;

	private Agencia agencia;

	// construtor padrão da classe Conta que define a data de criação da conta e inicializa o array de transacao
	public Conta() {

		dataAbertura = UtilData.data();
		transacoes = new ArrayList<Transacao>();
	}

	// construtor com dois parametros
	public Conta( Cliente cliente, int nconta ) {

		this();
		numero = nconta;
		titular = cliente;
		saldo = 0.0; // Conta em reais e zerada
	}

	@Override
	public Long getIdentificador() {

		return identificador;
	}

	public void setIdentificador(Long identificador) {

		this.identificador = identificador;
	}

	public int getNumero() {

		return numero;
	}

	public void setNumero(int numero) {

		this.numero = numero;
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

	public Collection<Transacao> getTransacoes() {

		return transacoes;
	}

	public void setTransacoes(Collection<Transacao> transacoes) {

		this.transacoes = transacoes;
	}

	public Cliente getTitular() {

		return titular;
	}

	public void setTitular(Cliente titular) {

		this.titular = titular;
	}

	public Agencia getAgencia() {

		return agencia;
	}

	public void setAgencia(Agencia agencia) {

		this.agencia = agencia;
	}

	@Override
	public String toString() {

		return getNumero() + "-" + getTitular().getNome();
	}

}
