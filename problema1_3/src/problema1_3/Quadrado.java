package problema1_3;

public class Quadrado {
	private double lado;
	
	public Quadrado(double lado){
		this.lado=lado;
	}
	
	public double area (){
		double a = lado*lado;
		return a;
	}
	
	public double perimetro(){
		double p = 4*lado;
		return p;
	}
	
	public String toString(){
		String s = "Lado: " + lado + ", Perimetro: " + perimetro() + ", Area: " + area() + ".";  
		return s;
	}
}
