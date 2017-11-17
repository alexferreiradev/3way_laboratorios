package curso.oo.lab05.ex4;

public class TestaVariavelEstaticaInstancia {

	public static void main(String[] args) {
		
		TresTiposDeVariaveis obj1 = new TresTiposDeVariaveis();
		TresTiposDeVariaveis obj2 = new TresTiposDeVariaveis();

		System.out.println("Print obj1 para var de instancia " + obj1.instanceVariable);
	
		TresTiposDeVariaveis.main(null);
		obj2.instanceVariable = "Novo valor de var de instacia";
		TresTiposDeVariaveis.staticVariable = "Alterando uma var estatica";
		System.out.println("Print obj2 para var de instancia " + obj2.instanceVariable);
		System.out.println("Print obj1 para var de estatica" + obj1.staticVariable);
	}
	

}
