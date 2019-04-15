package ex1;

public class Localidade {
	private String nome;
	private int populacao;
	private TipoLocalidade tipo;
	
	public Localidade(String nome, int populacao, TipoLocalidade tipo){
		this.nome=nome;
		this.tipo=tipo;
		this.populacao=populacao;
	}
	
	
	
	
	public String getNome(){
		return this.nome;
	}
	public int getPopulacao(){
		return this.populacao;
	}
	public TipoLocalidade getTipo(){
		return this.tipo;
	}




	@Override
	public String toString() {
		return  tipo + " " + nome + ", populaçao: " + populacao;
		
	}
	
	
}	
