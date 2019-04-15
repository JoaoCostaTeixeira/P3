package ex1;

import java.util.ArrayList;

public class Pais {
	private String nome;
	private Localidade capital;
	private ArrayList<Regiao> array = new ArrayList<>();
	public Pais(String nome, Localidade capital){
		this.nome=nome;
		this.capital=capital;
	}
	public Pais(String nome){
		this.nome=nome;
		this.capital=null;
	}	
	public void addRegiao(Regiao r){
		array.add(r);
	}	
	public String getNome(){
		return this.nome;
	}
	public Localidade getCapital(){
		return this.capital;
	}
	
	public int getPopulacao(){
		int sum=0;
		for(int i=0; i<array.size();i++){
			sum=sum+ array.get(i).getPopulacao();
		}
		return sum;
	}
	@Override
	public String toString() {
		if(capital == null){
			return "Pais: " + nome +", População: " + getPopulacao() +" (Capital: *Indefinida*)";
		}
		return "Pais: " + nome +", População: " + getPopulacao() +" (Capital: " + getCapital() + ")";
	}
	

	

}

