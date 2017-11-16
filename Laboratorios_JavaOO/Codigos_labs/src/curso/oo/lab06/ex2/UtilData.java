package curso.oo.lab06.ex2;

import java.util.Calendar;
import java.util.Date;

public class UtilData {

	// DiaDaSemana que representa Domingo
	static int DOMINGO = Calendar.SUNDAY;

	// DiaDaSemana que representa Segunda-Feira
	static int SEGUNDA = Calendar.MONDAY;

	// DiaDaSemana que representa Terça-Feira
	static int TERÇA = Calendar.TUESDAY;

	// DiaDaSemana que representa Quarta-Feira
	static int QUARTA = Calendar.WEDNESDAY;

	// DiaDaSemana que representa Quinta-Feira
	static int QUINTA = Calendar.THURSDAY;

	// DiaDaSemana que representa Sexta-Feira
	static int SEXTA = Calendar.FRIDAY;

	// DiaDaSemana que representa Sábado
	static int SÁBADO = Calendar.SATURDAY;

	// todo - alterar para se torna estatico
	// MesDoAno que representa Janeiro
	int JANEIRO = Calendar.JANUARY;

	// todo - alterar para se torna estatico
	// MesDoAno que representa Fevereiro
	int FEVEREIRO = Calendar.FEBRUARY;

	// todo - alterar para se torna estatico
	// MesDoAno que representa Março
	int MARÇO = Calendar.MARCH;

	// todo - alterar para se torna estatico
	// MesDoAno que representa Abril
	int ABRIL = Calendar.APRIL;

	// Dia do Mês
	static int DiaDoMes = Calendar.DAY_OF_MONTH;

	// Dia da semana
	static int DiaDaSemana = Calendar.DAY_OF_WEEK;

	// Método estático anônimo. As instruções dentro deste bloco
	// estático são executadas quando a classe é carregada,
	// ou seja, somente uma vez.
	static {
		System.out.println("Entrando no bloco estático.");
		Date data = Calendar.getInstance().getTime();
		System.out.println("Saindo do método estático data = " + agora(data));
	}

	// método estático que retorna o valor da data formatado como String
	static String agora(Date data) {

		return new java.text.SimpleDateFormat("dd/MM/yyyy  HH:mm").format(data);
	}

	// todo - metodo pode precisar de alteracao
	// método de instância
	// Formata uma data no formato dd/mm/aaaa hh:mm
	String DDMMAAAAHHMM(Date data) {

		return new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm").format(data);
	}

}
