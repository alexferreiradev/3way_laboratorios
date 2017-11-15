package curso.oo.lab06.ex2;

public class ExemploVariavelEstatica {

	public static void main(String[] args) {

		// Acessando variáveis estaticas da classe UtilData
		// veja que você não precisou criar uma instância da classe UtilData
		System.out.println("Dia da semana " + UtilData.DOMINGO);
		System.out.println("Dia da semana " + UtilData.SEGUNDA);
		System.out.println("Dia da semana " + UtilData.QUARTA);
		System.out.println("Dia da semana " + UtilData.SÁBADO);

		// Acesso a variável de instância data da classe UtilData
		// Você tem que criar uma instância da classe antes de você poder acessar seu valor.
		UtilData data = new UtilData();
		System.out.println("Mes do ano " + data.JANEIRO);
		System.out.println("Mes do ano " + data.FEVEREIRO);
		System.out.println("Mes do ano " + data.ABRIL);
		System.out.println("Mes do ano " + data.MARÇO);

		// A variável estática pode ser acessada por variável de instância de objeto
		System.out.println("Dia da Semana " + data.DiaDaSemana);
		data.DiaDaSemana = 3;
		System.out.println("Mudou Dia da Semana " + data.DiaDaSemana);

		// Variáveis estáticas podem sem acessada de múltiplas instâncias
		UtilData data2 = new UtilData();
		System.out.println("instancia 1 Dia do Mes " + UtilData.DiaDoMes);
		System.out.println("instancia 2 Dia do Mes " + data2.DiaDoMes);
		data2.DiaDoMes = 20;

		System.out.println("instancia 1 Mudou Dia do Mes " + UtilData.DiaDoMes);
		System.out.println("instancia 2 Mudou Dia do mês " + data2.DiaDoMes);
		
		// todo - mostre os valores de Janeiro e Fevereiro, dica, use sysou + UtilData 
		
	}

}
