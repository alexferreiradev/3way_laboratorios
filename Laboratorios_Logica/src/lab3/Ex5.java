package lab3;

public class Ex5 {

	public static void main(String[] args) {
		String []vogais = {"A", "E", "I", "O", "U"};
		System.out.println("Todas vogais");
		// Usando For in
		for (String vogal : vogais) {
			System.out.println(vogal);
		}
		
		// Usando for normal
		System.out.println("Usando for normal.");
		for (int i = 0; i < vogais.length; i++) {
			String vogal = vogais[i];
			System.out.println(vogal);
		}
	}

}
