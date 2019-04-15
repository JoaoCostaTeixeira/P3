package problema1_3;

public class Rectangulo {
	private double comprimento, largura;
	
	public Rectangulo (double comprimento, double largura){
		this.comprimento=comprimento;
		this.largura=largura;
	}
	public double area (){
		double a = comprimento*largura;
		return a;
	}
	
	public double perimetro(){
		double p = 2*comprimento + 2*largura;
		return p;
	}
	
	public String toString(){
		String s = "Comprimento: " + comprimento + ", Largura: " + largura + ", Perimetro: " + perimetro() + ", Area: " + area() + ".";  
		return s;
	}
} 
