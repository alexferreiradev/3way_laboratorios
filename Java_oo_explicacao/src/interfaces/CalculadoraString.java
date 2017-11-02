package interfaces;

public class CalculadoraString implements CalculadoraPadrao {

	@Override
	public Object somar(Object num1, Object num2) {
		String numInteiro1 = (String) num1;
		String numInteiro2 = (String) num2;
		
		return String.valueOf(Integer.valueOf(numInteiro1) + Integer.valueOf(numInteiro2));
	}

	@Override
	public Object multiplicar(Object num1, Object num2) {
		// TODO Auto-generated method stub
		return null;
	}

}
