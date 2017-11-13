package curso.oo.lab05.ex2;

public class MetodosInstanciaEEstatico1 {

	public static void main(String[] args) {

		// Cria duas instâncias da classe String
		String strInst1 = new String("Sou uma instância de objeto da classe String");
		String strInst2 = "Viva com paixão!";

		// Invoca o método de instância charAt()
		// através das instâncias da classe String
		char x = strInst1.charAt(2);
		char y = strInst2.charAt(1);
		char z = strInst2.charAt(0);

		System.out.println("O 3.o caracter da strInst1 = " + x);
		System.out.println("O 2.o caracter da strInst2 = " + y);
		System.out.println("O 1.o caracter da strInst2 = " + z);

		// Invoca o método de instância equalsIgnoreCase(...)
		boolean b = strInst1.equalsIgnoreCase(strInst2);
		String strInst3 = b ? "Sim" : "Não";
		
		System.out.println("As variáveis strInst1 " + " e strInst2 tem o mesmo" + " conjunto de caracteres? " + strInst3);
		// Invoca um método estático, valueOf (int i), da classe String
		int i = 23;
		String strInst4 = String.valueOf(i);
		System.out.println("valor de strInst4 = " + strInst4);

		// Você já usou o método estático parseInt() da classe
		// Integer no exercí¬cio anterior
		// Agora cria uma instância de objeto da classe String
		String strInst5 = new String("34");
		int ii = Integer.parseInt(strInst5);
		System.out.println("valor de ii = " + ii);

	}

}
