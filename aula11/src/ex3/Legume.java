package ex3;

public class Legume extends Alimento implements Vegetariano {
	private String name;
	public Legume(String name, double proteina, double calorias, double peso){
		super(proteina, calorias, peso);
		this.name=name;
	}
	@Override
	public String toString() {
		return "Legume " + name + ", Proteinas " + getProteinas() + ", Peso " + getPeso()
				+ ", Calorias " + super.calorias();
	}
	
	
}
