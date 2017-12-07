package threeway.projeto.modelo;


public class Cliente extends Pessoa implements Comparable<Cliente>{
	private String cpf;
	private String rg;
	public Cliente() {
	}
	
	public Cliente(String nome, String cpf ) {
		super(nome);
		this.cpf = cpf;
	}
	
	public Cliente(String nome) {
		this.setNome(nome);
	}
	
	@Override
	public void ImprimeNome() {
		System.out.println("Nome do cliente é : " + getNome() + " No CPF: " + cpf + " Seu endereco :" + getEndereco());
	}
	
	@Override
	public String toString(){
		return getNome();
	}
	
	//get e set
	public void setCpf(String value){
		this.cpf = value;
	}
	public void setRg(String value){
		this.rg = value;
	}
	public String getCpf(){
		return cpf;
	}
	public String getRg(){
		return rg;
	}

	@Override 
    public int compareTo(Cliente outroCliente) {
		if(this.rg != null && outroCliente.rg != null){
	        if (Integer.parseInt(this.rg) < Integer.parseInt(outroCliente.rg)) {
	            return -1;
	        }
	        if (Integer.parseInt(this.rg) > Integer.parseInt(outroCliente.rg)) {
	            return 1;
	        }
		}
        return 0;
    }

}
