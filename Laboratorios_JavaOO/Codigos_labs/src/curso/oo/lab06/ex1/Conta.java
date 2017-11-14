package curso.oo.lab06.ex1;

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
	
	// todo - criar 

}
