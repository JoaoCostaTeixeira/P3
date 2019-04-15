package ex1;

public class Ponto {
	private double x, y;
	public Ponto(double x, double y){
		this.x=x;
		this.y=y;
	}
	
	public double x(){
		return x;
	}
	public double y(){
		return y;
	}

	@Override
	public String toString() {
		return "x: " + x + ", y: " + y;
	}
	
}
