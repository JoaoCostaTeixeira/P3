package ex1;

abstract class Regiao {
	private String nome;
	private int populacao;
	
	public Regiao(String nome, int populacao){
		this.nome=nome;
		this.populacao=populacao;
	}
	
	
	
	
	
	
	
	
	public int getPopulacao(){
		return this.populacao;
	}
	public String getNome(){
		return this.nome;
	}

}
