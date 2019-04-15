package ex2;

public abstract class Figura {
	private Ponto centro;
	public Figura(double x, double y){
		centro = new Ponto(x,y);
		this.centro=centro;
	}
	public Figura(Ponto centro){
		this.centro=centro;
	}
	
	public Ponto getCentro(){
		return centro;
	}
	
	public abstract double area();
	public abstract String toString();
	
}	
 
 
 