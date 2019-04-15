package ex4;
import java.util.ArrayList;
public class filmes {
	
	private String titulo;
	private String categoria;
	private String idade;
	private boolean disponivel;
	ArrayList<Integer> rating = new ArrayList<>();
	
	public filmes (String titulo, String categoria, String idade){
		this.titulo=titulo; 
		this.categoria=categoria;
		this.idade=idade;
		disponivel=true;
		
	}
	
	public void listarFilmes(int idade, int ID){
		if(idade>=18 && this.disponivel){
			System.out.printf("%d -", ID+1);
			System.out.println(this.toString());
		}else if(idade<18 && idade>=16 && !this.idade.equals("M18") && this.disponivel){
			System.out.printf("%d -", ID+1);
			System.out.println(this.toString());
		}else if(idade<16 && idade>=12 && !this.idade.equals("M18") && !this.idade.equals("M16")  && this.disponivel){
			System.out.printf("%d -", ID+1);
			System.out.println(this.toString());
		}else if (idade<12 && idade>=6 && (this.idade.equals("ALL") || this.idade.equals("M6"))){	
			System.out.printf("%d -", ID+1);
		    System.out.println(this.toString());
		}else if(idade<6 || this.idade.equals("ALL")){
			System.out.printf("%d -", ID+1);
			 System.out.println(this.toString());
		}
	}
	public void mudarDispo (boolean x){
		this.disponivel=x;
	}
	public boolean getDispo(){
		return this.disponivel;
	}
	
	public int getRating(){
		int soma=0;
		if(rating.size()==0) return 0;
		for(int i=0; i<rating.size(); i++){
			soma=soma+rating.get(i);
		}
		int rat = soma/rating.size();
		return rat;
	}
	public void giveRating(int r){
		rating.add(r);
	}

	@Override
	public String toString() {
		return "Filme [Titulo = " + titulo + ", Categoria = " + categoria + ", Faixa etaria = " + idade + ", Disponibilidade = "
				+ disponivel + ", Rating = " + getRating() + "]";
	}

	
}

