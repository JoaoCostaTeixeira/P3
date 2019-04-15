package ex2;
import java.util.*;

public class ColecaoFiguras {
	private double maxArea;
	private ArrayList<Figura> fig = new ArrayList<>();
	
	public ColecaoFiguras(double maxArea){
		this.maxArea=maxArea;
	}
	
	public boolean addFigura(Figura f){
		if(areaTotal()+f.area()>maxArea || fig.contains(f)){
			return false;
		}
		fig.add(f);
		return true;
	}
	
	public boolean delFigura(Figura f){
		if(fig.contains(f)){
			fig.remove(fig.indexOf(f)); 
			return true;
		}
		return false;
	}
	
	public double areaTotal(){
		double area=0;
		for(int i=0; i<fig.size() ; i++){
			area = area + fig.get(i).area();
		}
		return area;
	}
	
	public boolean exists(Figura f){
		return fig.contains(f);
	}
	
	public String toString(){
		return fig.toString();
	}
	
	public Figura[] getFiguras(){
		Figura[] f = new Figura[fig.size()];
		for(int i=0; i<fig.size();i++){
			f[i]=fig.get(i);
		}
		return f;
	}
	
	public Ponto[] getCentros(){
		Ponto [] p = new Ponto[fig.size()];
		for(int i=0; i<fig.size() ; i++){
			p[i]=fig.get(i).getCentro();
		}
		return p;
	}
}
