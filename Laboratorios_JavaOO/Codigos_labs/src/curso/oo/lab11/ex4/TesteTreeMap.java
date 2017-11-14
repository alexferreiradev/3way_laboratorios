package curso.oo.lab11.ex4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class TesteTreeMap {

	public static void main(String[] args) {

		HashMap<Agencia, Cliente[]> hm = new HashMap<Agencia, Cliente[]>();
		// adiciona chave - agência e valor = array Cliente
		hm.put(new Agencia("ag01"), new Cliente[] { new Cliente("Enricando Cardoso"), new Cliente("Inacio Estole"), new Cliente("Luiz Ladrum"), });
		hm.put(new Agencia("ag02"), new Cliente[] { new Cliente("Henri Cando"), new Cliente("Stolin Lu La"), new Cliente("Lara Pio"), });
		hm.put(new Agencia("ag03"), new Cliente[] { new Cliente("Sony Gando"), new Cliente("Leiro Pisto"), new Cliente("Waga Oubum Du"), });

		// criando TreeMap
		TreeMap<Agencia, Cliente[]> tm = new TreeMap<Agencia, Cliente[]>(hm);

		// imprime a coleção
		System.out.println(tm);

		// pega as chaves
		Set chaves = tm.keySet();

		// imprime as chaves
		System.out.println(chaves);

		// pega os valores
		Collection<Cliente[]> valores = tm.values();

		// imprime os valores
		for (Cliente[] cs : valores) {
			for (Cliente c : cs) {
				System.out.println(c);
			}
		}
	}
}
