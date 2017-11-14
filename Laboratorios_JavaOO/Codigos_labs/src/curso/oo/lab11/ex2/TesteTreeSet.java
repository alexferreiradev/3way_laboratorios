package curso.oo.lab11.ex2;

import java.util.TreeSet;

public class TesteTreeSet {

	public static void main(String[] args) {

		TreeSet<Cliente> clientes = new TreeSet<Cliente>();
		clientes.add(new Cliente("Jesus"));
		// duplicado
		clientes.add(new Cliente("Maria"));
		clientes.add(new Cliente("Mateus"));
		clientes.add(new Cliente("Maria"));
		// duplicado
		clientes.add(new Cliente("Maria"));
		clientes.add(new Cliente("Paulo"));
		clientes.add(new Cliente("João"));
		// imprimir com toString() de Cliente
		// sem implementar Comparable
		System.out.println(clientes);
	}

}
