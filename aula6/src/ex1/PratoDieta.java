package ex1;

public class PratoDieta extends Prato {
	private double calorias;
	public PratoDieta(String nome, double calorias){
		super(nome);
		this.calorias=calorias;
	}
	
	public boolean addIngrediente(Alimento al){
		if(super.calorias()+al.getCalorias()<=calorias){
			return super.addIngrediente(al);
		}else
			return false;
	}

	@Override
	public String toString() {
		return "Dieta (" + super.calorias() + "), "+ super.getNome() + " composto por " + super.size() + " ingredientes ";
	}
	
	
}
