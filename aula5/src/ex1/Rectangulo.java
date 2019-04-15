package ex1;

public class Rectangulo extends Figura {
	private double comp, larg;
	public Rectangulo(double x,double y, double comp, double larg){
		 super(x,y);
		 this.comp=comp;
		 this.larg=larg;
	 }
	 public Rectangulo (Ponto c,double comp, double larg){
		 super(c);
		 this.comp=comp;
		 this.larg=larg;
	 }
	 public Rectangulo(double comp, double larg){
		 super(0,0);
		 this.comp=comp;
		 this.larg=larg;
	 }
	 public Rectangulo(Rectangulo r){
		 super(r.getCentro());
		 this.larg=r.getLargura();
		 this.comp=r.getComprimento();
	 }
	 public double getLargura(){
		 return larg;
	 }
	 public double getComprimento(){
		 return comp;
	 }
	 public double perimetro(){
		 double p=2*larg + 2* comp;
		 return p;
	 }
	 public double area(){
		 double a= larg*comp;
		 return a;
	 }
	
	 @Override
	public boolean equals(Object r){
		if(this==r){
			return true;
		}
		if(getClass()!=r.getClass()){
			return false;
		}
		if(r==null){
			return false;
		}
			
		Rectangulo other = (Rectangulo) r;
		
		if(getCentro()==null && other.getCentro()!=null){
			return false;
		}else if(!getCentro().equals(other.getCentro())){
			return false;
		}else if(!(getLargura()==other.getLargura() && getComprimento()==other.getComprimento())){
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "Rectangulo de centro x: "+ super.getCentro().x() + " y: " + super.getCentro().y() + ", altura: " + getLargura() + ", comprimento: " + getComprimento();
	}	
	 
}
