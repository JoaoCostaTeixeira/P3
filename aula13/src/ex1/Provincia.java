package ex1;

public class Provincia extends Regiao {
	private String governador;
	
	public Provincia(String nome, int populacao, String governador){
		super(nome, populacao);
		this.governador=governador;
	}


	
	
	
	
	public String getNome(){

		return super.getNome();
	}
	public String getGovernador(){
		return this.governador;
	}
	public int getPopulacao(){
		return super.getPopulacao();
	}
}
