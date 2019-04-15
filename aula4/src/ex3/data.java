package ex4;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class data {
	private int dia, mes, ano;
	
	public data(int dia, int mes, int ano){
		this.dia=dia;
		this.ano=ano;
		this.mes=mes;
	}
	public int getDia(){
		return this.dia;
	}
	public int getMes(){
		return this.mes;
	}
	public int getAno(){
		return this.ano;
	}
	public int getIdade(){
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String data = dateFormat.format(date);
		String [] aux = data.split("/");
		int i1 = Integer.parseInt(aux[0]);
		int i2 = Integer.parseInt(aux[1]);
		int i3 = Integer.parseInt(aux[2]);
		
		if(i2>mes){
			return i3-ano;
		}else if(i2<mes){
			return i3-ano-1;
		}else{
			if(i1>=dia){
				return i3-ano;
			}else{
				return i3-ano-1;
			}
		}
	}
	@Override
	public String toString() {
		return  dia + "/" + mes + "/" + ano;
	}
	
	
	
	
}
