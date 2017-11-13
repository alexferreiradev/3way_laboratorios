package curso.oo.lab05.ex5;

public class CastingPrimitivos {

	public static void main(String[] args) {

		// casting explicito exemplo 1
		long numLong = 10L;
		byte numByte = (byte) numLong;
		System.out.println("long " + numLong + " e explicitamente moldado para byte " + numByte);

		// casting explicito exemplo 2
		float numFloat = 10F;
		short numShort = (short) numFloat;
		System.out.println("float " + numFloat + " e explicitamente moldado para short " + numShort);

		// casting explicito exemplo 3
		int numInt = 10;
		char numChar = (char) numInt;
		System.out.println("int " + numInt + " e explicitamente moldado para char " + numChar);

	}

}
