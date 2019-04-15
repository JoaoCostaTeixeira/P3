package ex3;

public class Peixe extends Alimento {
	private TipoPeixe tip;
	public Peixe(TipoPeixe tip,double proteina, double calorias, double peso){
		super(proteina, calorias, peso);
		this.tip=tip;
	}
	@Override
	public String toString() {
		return "Peixe " + tip + ", Proteinas " + getProteinas() + ", Peso " + getPeso()
				+ ", Calorias " +super.calorias();
	}
	
}
