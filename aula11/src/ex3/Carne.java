package ex3;
public class Carne extends Alimento {
	private VariedadeCarne var;
	
	public Carne(VariedadeCarne var,double proteina, double calorias, double peso){
		super(proteina, calorias, peso);
		this.var=var;
	}

	@Override
	public String toString() {
		return "Carne " + var + ", Proteinas " + getProteinas() + ", Peso " + getPeso()
				+ ", Calorias " + super.calorias();
	}
	
	
	
}
