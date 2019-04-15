package ex3;
import java.util.*;
public class Ementa {
	private ArrayList<Prato> [] pra = new ArrayList[7];
	private String nome;
	private String local;
	public Ementa(String nome, String local){
		this.nome=nome;
		this.local=local;
		for(int i=0; i<7; i++){
			pra[i]= new ArrayList<Prato>();
		}
	}
	public boolean addPrato(Prato p, DiaSemana Dia){
		if(!pra[Dia.ordinal()].contains(p) && p!=null){
			pra[Dia.ordinal()].add(p);
			return true;
		}else
			return false;
	}
	@Override
	public String toString() {
		String s = "";
		for(int i=0; i<7 ; i++){
			if(pra[i]!=null){
				for(int j=0; j<pra[i].size(); j++){
					s = s + pra[i].get(j).toString() + " dia " ;
					if(i==0) s = s + DiaSemana.Segunda;
					if(i==1) s = s + DiaSemana.Terça;
					if(i==2) s = s + DiaSemana.Quarta;
					if(i==3) s = s + DiaSemana.Quinta;
					if(i==4) s = s + DiaSemana.Sexta;
					if(i==5) s = s + DiaSemana.Sabado;
					if(i==6) s = s + DiaSemana.Domingo;
					s = s + "\n";
				}
			}
		}
		return s;
	}
	


}
