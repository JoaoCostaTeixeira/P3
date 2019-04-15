package ex1;

public abstract class Figura implements Comparable <Figura> {
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
	public abstract double perimetro();
	
	
	public int compareTo(Figura fig){
		if(fig==null) 
			throw new NullPointerException("....");
		return (int) (area()-fig.area());
	}
	
}	
 
 
 