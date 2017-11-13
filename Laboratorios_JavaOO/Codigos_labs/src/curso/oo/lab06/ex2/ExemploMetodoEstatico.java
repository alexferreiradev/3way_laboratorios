package curso.oo.lab06.ex2;

import java.util.Date;

public class ExemploMetodoEstatico {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Date data = new Date();

		// Invocando metodo estatico da classe UtilData , nao é preciso instanciar a classe UtilData
		System.out.println(UtilData.agora(data));

		// Metodo estático pode ser invocado por uma instancia da classe UtilData
		UtilData idata = new UtilData();
		System.out.println(idata.agora(data));

		// Metodo de instancia so pode ser invocado por uma instancia
		System.out.println(idata.DDMMAAAAHHMM(data));

		// Metodos de instancia nao podem ser invocados diretamente ocorre erro de compilacao
		UtilData.DDMMAAAAHHMM(data);
	}

}
