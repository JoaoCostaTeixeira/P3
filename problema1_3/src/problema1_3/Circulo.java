package problema1_3;
public class Circulo {  
	
	private double raio;  
	private Ponto centro;   
	
	public Circulo(double x, double y, double r){
		this.raio=r;
		Ponto centro = new Ponto (x,y);
		this.centro=centro;
	}
	public Circulo(Ponto centro, double r){
		this.centro=centro;
		this.raio=r;
	}
	public double area (){
		double a = Math.PI*Math.pow(raio, 2);
		return a;
	}
	
	public double perimetro(){
		double p = 2*raio*Math.PI;
		return p;
	}
	public String toString(){
		String s = "Raio: " + raio + ", Diametro: " + 2*raio + ", Centro: (" + centro.x + ", " + centro.y + "), Perimetro: " + perimetro() + ", Area: " + area() + ".";  
		return s;
	}
	
	public void comparacao(Circulo c2){
		if(this.raio == c2.raio){
			System.out.println("Os circulos sao iguais");
		}else {
			System.out.println("Os circulos sao diferentes");
		}
		
		double dist= Math.pow(this.centro.x-c2.centro.x, 2) + Math.pow(this.centro.y-c2.centro.y, 2);
		if(this.raio+c2.raio>= dist){
			System.out.println("Os circulos intreceptam-se");
		}else{
			System.out.println("Os circulos nao se intreceptam");
		}
		
			
		
	}
	
		
	
}
