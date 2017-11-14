package curso.oo.lab11.ex2;

import java.util.HashSet;

public class TesteHashSet {

	public static void main(String[] args) {

		HashSet<Cliente> clientes = new HashSet<Cliente>();
		clientes.add(new Cliente("Jesus"));
		// duplicado
		clientes.add(new Cliente("Jesus"));
		clientes.add(new Cliente("Mateus"));
		clientes.add(new Cliente("Maria"));
		// duplicado
		clientes.add(new Cliente("Maria"));
		clientes.add(new Cliente("Paulo"));
		clientes.add(new Cliente("João"));

		// imprimir com toString() de Cliente sem override de equals() e hashCode
		System.out.println(clientes);

		HashSet<Conta> contas = new HashSet<Conta>();
		contas.add(new Conta(new Cliente("Ze"), 5));
		contas.add(new Conta(new Cliente("Lucas"), 2));
		
		contas.add(new Conta(new Cliente("Pedro"), 1));
		// duplicado o numero da conta
		contas.add(new Conta(new Cliente("Maria"), 1));
		
		contas.add(new Conta(new Cliente("Joao"), 0));
		contas.add(new Conta(new Cliente("Ana"), 4));

		// imprimir com override de equals() e hashCode()
		System.out.println(contas);
	}

}
