package curso.oo.lab07;

public class TesteHeranca {

	public static void main(String[] args) {

		// cria uma pessoa
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Ciclano");

		// Mostra toString() metodo sobrescrito na classe Cliente
		pessoa.ImprimeNome();

		// cria um cliente
		Cliente cliente = new Cliente();

		cliente.setNome("Fulano de tal");
		cliente.setCpf("999.999.999-99");

		// Mostra toString() metodo sobrescrito de Pessoa dentro da classe Cliente
		cliente.ImprimeNome();

		// metodo de acesso a atributo presente no objeto Pessoa
		cliente.setTelefone("(99)9999-9999");

		// Mostra toString() metodo sobrescrito de Pessoa dentro da classe Cliente
		cliente.ImprimeNome();
		
		// referencia subclasse Cliente, upper casting
		Pessoa pessoaCliente = new Cliente("Ze", "777.777.777-77");
		// polimorfismo no tempo de execucao
		pessoaCliente.ImprimeNome();
		
		//Erro de compilação Pessoa não e tipo de Cliente
		Cliente pessoaCliente1 = (Cliente) pessoa;
		pessoaCliente1.ImprimeNome();

	}

}
