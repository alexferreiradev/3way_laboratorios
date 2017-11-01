package interfaces;

public class CalculadoraInteiro implements CalculadoraPadrao {

	@Override
	public Object somar(Object num1, Object num2) {
		int numInteiro1 = (int) num1;
		int numInteiro2 = (int) num2;
		
		return numInteiro1 + numInteiro2;
	}

	@Override
	public Object multiplicar(Object num1, Object num2) {
		// TODO Auto-generated method stub
		return null;
	}

}
