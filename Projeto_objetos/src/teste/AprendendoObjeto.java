package teste;

public class AprendendoObjeto {

	public static void main(String[] args) {
		// Criacao de objeto 
		Carro objCarro = new Carro();
		
		// Usando um metodo do objeto da classe Carro
		objCarro.ligarChave();
		
		// Usando set para alterar a marca
		objCarro.setMarca("Volks");
		
		// Usando um get do objeto, para obter um campo = marca
		String marca = objCarro.getMarca();
		System.out.println("O carro tem a marca: " + marca);
		
		// Criacao de obj com mesma classe de obj anterior
		Carro bmwBranca = new Carro("BMW", "branca");
		
		String marcaBmw = bmwBranca.getMarca();
		System.out.println("O carro tem a marca: " + marcaBmw);
		
	}

}
