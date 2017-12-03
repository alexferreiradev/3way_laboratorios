package curso.oo.lab05.ex5;

public class CastingPrimitivosResposta {

	public static void main(String[] args) {

		// casting explicito exemplo 1
		// todo 1 - crie uma variavel long
		long numLong = 1000L;
		// todo 2 - crie uma variavel byte convertida explicitamente do long anterior
		byte numByte = (byte)  numLong;
		System.out.println("2^7 = " + (Math.pow(2, 32)));
		System.out.println("Byte = " + numByte);
		System.out.println("long " + numLong + " e explicitamente moldado para byte " + numByte);

		// casting explicito exemplo 2
//		 todo 1 - crie uma variavel float
		float numFloat = 3.5f;
		// todo 2 - crie uma variavel short convertida explicitamente do float anterior
		short numShort = (short) numFloat;
		System.out.println("float " + numFloat + " e explicitamente moldado para short " + numShort);
//
//		// casting explicito exemplo 3
//		// todo 1 - crie uma variavel int
		int numInt = 126;
//		// todo 2 - crie uma variavel char convertida explicitamente do int anterior
		char numChar = (char) numInt;
		System.out.println("int " + numInt + " e explicitamente moldado para char " + numChar);

	}

}
