package ex1;

public class Quadrado extends Figura{
	 private double lado;
	 public Quadrado(double x,double y, double lado){
		 super(x,y);
		 this.lado=lado;
	 }
	 public Quadrado (Ponto c, double lado){
		 super(c);
		 this.lado=lado;
	 }
	 public Quadrado(double lado){
		 super(0,0);
		 this.lado=lado;
	 }
	 public Quadrado(Quadrado q){
		 super(q.getCentro());
		 this.lado=q.getLado();
	 }
	 public double getLado(){
		 return lado;
	 }
	 public double perimetro(){
		 double p = 4*lado;
		 return p;
	 }
	 public double area(){
		 double a = lado*lado;
		 return a;
	 }
	 
	 @Override
		public boolean equals(Object q) {
			if(this==q){  
				return true;
			}
			if(q==null){
				return false;
			}
			if(getClass()!=q.getClass()){
				return false;
			}
			
			Quadrado other = (Quadrado) q;
			if(getCentro()==null && other.getCentro()!=null){
				return false;
			}else if(!getCentro().equals(other.getCentro())){
				return false;
			}else if(!(getLado()==other.getLado())){
				return false;
			}
			return true;
		}
	@Override
	public String toString() {
		return "Quadrado de centro x: "+ super.getCentro().x() + " y: " + super.getCentro().y() + " e lado: " + getLado();
	}	
	 
}
