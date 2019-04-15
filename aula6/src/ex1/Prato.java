package ex1;
import java.util.*;

public class Prato {
	private ArrayList<Alimento> p = new ArrayList<Alimento>();
	private String name;
	public Prato(String name){
		this.name=name;		
	}
	public String getNome(){
		return name;
	}
	
	public boolean addIngrediente(Alimento al){
		if(!p.contains(al) && al!=null){
			p.add(al);
			return true;
		}
		return false;
	}
	public int size(){
		return p.size();
	}
	
	public double calorias(){
		double sum=0;
		for(int i=0; i<p.size(); i++){
			sum = sum + p.get(i).getCalorias();
		}
		return sum;
	}

	@Override
	public String toString() {
		return "Prato " + name + ", composto por " + p.size() + " ingredientes";
	}	
}
