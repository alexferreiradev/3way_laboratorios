package interfaces;

public class TestaCalculadora {

	public static void main(String[] args) {
		CalculadoraPadrao calculadoraInt = new CalculadoraInteiro();
		CalculadoraPadrao calculadoraString = new CalculadoraString();
		
		CalculadoraPadrao calcs[] = {calculadoraInt, calculadoraString, calculadoraInt, calculadoraString, calculadoraInt, calculadoraInt};
		for (CalculadoraPadrao calculadoraPadrao : calcs) {
			Object resultado = null;
			if (calculadoraPadrao instanceof CalculadoraInteiro) {
				resultado = calculadoraPadrao.somar(1, 1);
			} else if (calculadoraPadrao instanceof CalculadoraString) {
				resultado = calculadoraPadrao.somar("1", "1");
			}
			
			System.out.println("Res: " + resultado + "tipo: " + resultado.getClass().getName());
		}
	}

}
