package enun;

import java.util.Iterator;

public class TestaEnun {

	public static void main(String[] args) {
		
		System.out.println("Dias da semana");
		
		DiasSemana []terQui = {DiasSemana.KITKAT, DiasSemana.QUI};
		
		System.out.println("A 3way da aula nos dias de semana: ");
		for (DiasSemana diasSemana : terQui) {
				System.out.println("Versao do kitkat: " + diasSemana.ordinal());
		}
		
		String versao = "teste";
		
		if (versao == DiasSemana.KITKAT.getNumeroVersao()) {
			System.out.println("Faca isso");
		}
		
		if (versao == DiasSemana.KITKAT.getNumeroVersao()) {
			System.out.println("Faca aquilo");
		}
		
		System.out.println("Fim");
	}

}
