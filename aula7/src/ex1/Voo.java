package ex1;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.*;

public class Voo {
	private String hora;
	private String voo;
	private String origem;
	private String atraso;
	private String nome;
	
	public Voo(String hora, String voo, String origem, String atraso, String nome){
		this.hora=hora;
		this.voo=voo;
		this.origem=origem;
		this.atraso=atraso;
		this.nome=nome;
	}
	public int atraso(){
		if(atraso.equals("")) return 0;
		String [] aux2 = atraso.split(":");
		int total = Integer.parseInt(aux2[0])*60 + Integer.parseInt(aux2[1]);
		return total; 
	}
	public String getAtraso(){
		String [] aux = hora.split(":");
		String [] aux2 = atraso.split(":");
		if(atraso.equals("")) return "";
		int total = Integer.parseInt(aux[0])*60 + Integer.parseInt(aux[1]) + Integer.parseInt(aux2[0])*60 + Integer.parseInt(aux2[1]);
		int horas = total/60;
		int minutos = total - horas*60;
		return "Previsto " + horas + ":" + minutos;
	}
	public String getOrigem(){
		return origem;
	}
	@Override
	public String toString() {
		return  hora + "\t" + voo +"\t" + nome +  "\t" + origem + "\t" + atraso + "\t" + getAtraso();
	}
	public String getNome(){
		return nome;
	}
	
	
	

}
