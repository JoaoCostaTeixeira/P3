package ex1;

public class Alimento {
	private double proteinas;
	private double calorias;
	private double peso;
	
	public Alimento(double proteinas, double calorias, double peso){
		this.peso=peso;
		this.proteinas=proteinas;
		this.calorias=calorias;
	}
	
	public double getProteinas(){
		return proteinas;
	}
	public double getPeso(){
		return peso;
	}
	public double getCalorias(){
		double cal =  (calorias*peso)/100;
		return cal;
	}
	public double calorias(){
		return calorias;
	}
	
}
