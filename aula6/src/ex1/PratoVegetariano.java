package ex1;

public class PratoVegetariano extends Prato implements Vegetariano {
	public PratoVegetariano(String nome){
		super(nome);
	}
	public boolean addIngrediente(Alimento al){
		if(al instanceof Vegetariano){
			return super.addIngrediente(al);
		}
		else return false;
	}
	
	@Override
	public String toString() {
		return "Vegetariano " + super.getNome() + " composto por " + super.size() + " ingredientes ";
	}
}
