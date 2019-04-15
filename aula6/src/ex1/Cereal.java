package ex1;

public class Cereal extends Alimento implements Vegetariano {
	private String name;
	public Cereal(String nome,double proteina, double calorias, double peso){
		super(proteina, calorias, peso);
		this.name=name;
	}
	@Override
	public String toString() {
		return "Cereal " + name + ", Proteinas " + getProteinas() + ", Peso " + getPeso()
				+ ", Calorias " + super.calorias();
	}
	
	
}
