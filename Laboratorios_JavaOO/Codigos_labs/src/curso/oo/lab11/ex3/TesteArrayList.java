package curso.oo.lab11.ex3;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {

	public static void main(String[] args) {

		List<String> al = new ArrayList<String>(2);

		System.out.println(al + ", size = " + al.size());

		// Adiciona itens ao ArrayList
		al.add("Robaum");
		al.add("Usurpa");
		al.add("Omitte");

		System.out.println(al + ", size = " + al.size());

		// Remove item, usa equals e hashCode
		al.remove("Usurpa");
		System.out.println(al + ", size = " + al.size());

		// Checa se a lista contem o elemento especificado
		Boolean b = al.contains("Omitte");
		System.out.println("A lista contem Omitte = " + b);
		b = al.contains("Paumdu");
		System.out.println("A lista contem Paumdu = " + b);
	}

}
