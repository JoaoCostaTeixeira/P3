package aula02e21;
import java.util.*;
public class video {
	
	private String titulo;
	private String categoria;
	private String idade;
	private boolean disponivel;
	ArrayList<video> filme = new ArrayList<>();
	
	public video(String titulo, String categoria, String idade ){
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

	@Override
	public String toString() {
		return "titulo = " + titulo + ", categoria = " + categoria + ", idade = " + idade + ", disponibilidade = "
				+ disponivel;
	}
}
