package ex1;

public class Circulo extends Figura{
	private double r;
	
	public Circulo (double x, double y, double r){
		super(x,y);
		this.r=r;		
	}
	public Circulo(Ponto c,double r){
		super(c);
		this.r=r;
	}
	public Circulo(double r){
		super(0,0); 
		this.r=r;
	}
	public Circulo(Circulo c){
		super(c.getCentro());
		this.r=c.getRaio();
	}
	public double getRaio(){
		return r;
	}
	public double perimetro(){
		double p = 2 * r * Math.PI;
		return p;
	}
	public double area(){
		 double a = Math.PI*Math.pow(r, 2);
		 return a;
	}
	
	
	@Override
	public String toString() {
		return "Circulo de centro x: "+ super.getCentro().x() + " y: " + super.getCentro().y() + " e raio: " + getRaio();
	}
	@Override
	public boolean equals(Object c) {
		if(this==c){
			return true;
		}
		if(c==null){
			return false;
		}
		if(getClass()!=c.getClass()){
			return false;
		}
		Circulo other = (Circulo) c;
		if (getCentro() == null) {
			if (other.getCentro() != null)
				return false;
		} else if (!getCentro().equals(other.getCentro()))
				return false;
		if (getRaio() != other.getRaio())
			return false;
		return true;
	}
}
