package aula1;
import java.util.*;

public class Metodos {
	private String a;
	public Metodos(String a){
		this.a=a;
	}
	
	public int numeros(){ //total de caracteres numericos
		int j=0;
		for(int i=0; i<a.length(); i++){
			if(Character.isDigit(a.charAt(i))){
				j++;
			}
		}
		return j;
	}
	public boolean minusculas(){  //verifica se a frase tem apenas letras minusculas
		for(int i=0; i<a.length(); i++){
			if(Character.isUpperCase(a.charAt(i)) && !Character.isDigit(a.charAt(i))){
				return false;
			}
		}
		return true;
	}
	public boolean maiusculas(){ //verifica se a frase tem apenas letras maiusculas 
		for(int i=0; i<a.length(); i++){
			if(Character.isLowerCase(a.charAt(i)) && !Character.isDigit(a.charAt(i))){
				return false;
			}
		}
		return true;
	}
	String[] b  = a.split("\\W+");
	LinkedList<palavras> words = new LinkedList<>();
	
	private void totalelidas (){
		for(int i=0; i<b.length; i++){
			if(words.contains(b[i])){
				b[i].
			}
		}
		
	}
	
	
	
	
	
	
	}
}
class palavras{
	int quant=0;
	String fra;
}

