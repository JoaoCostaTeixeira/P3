package ex1;

public class Estado extends Regiao {
	private Localidade capital;
	
	public Estado(String nome, int populacao, Localidade capital ){
		super(nome, populacao);
		this.capital=capital;
		if(!capital.getTipo().equals(TipoLocalidade.Cidade)){
			throw new IllegalArgumentException("Capital invalida");
		}
	}
	
	
	
	
	
	public Localidade getCapital(){
		return this.capital;
	}
	public String getNome(){

		return super.getNome();
	}
	public int getPopulacao(){

		return super.getPopulacao();
	}





	@Override
	public String toString() {
		return "Estado ( Capital=" + capital + "]";
	}

	
}
