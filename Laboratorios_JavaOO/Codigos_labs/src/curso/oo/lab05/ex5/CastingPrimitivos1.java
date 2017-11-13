package curso.oo.lab05.ex5;

public class CastingPrimitivos1 {

	public static void main(String[] args) {

		// casting implicito exemplo 1
		int numInt = 10;
		double numDouble = numInt;
		System.out.println("int " + numInt + " e implicitamente moldado para double " + numDouble);

		// casting implicito exemplo 2
		int numInt1 = 3;
		int numInt2 = 2;
		double numDouble2 = numInt1 / numInt2;
		System.out.println("numInt1/numInt2 " + numInt1 / numInt2 + " e implicitamente moldado para " + numDouble2);

		// casting explicito exemplo 1
		double valDouble = 10.12;
		int valInt = (int) valDouble;
		System.out.println("double " + valDouble + " e explicitamente moldado para int " + valInt);

		// casting explicito exemplo 2
		double x = 10.2;
		int y = 2;
		int resultado = (int) ( x / y );
		System.out.println("x/y " + x / y + " e explicitamente moldado para int " + resultado);
	}

}
