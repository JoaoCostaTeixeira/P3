package ex3;

import java.util.Scanner;

public class Pessoa {
	private String nome;
	private int cc;
	private Data nasc;
	
	public Pessoa(String nome, int cc, Data nasc) {
		this.nome = nome;
		this.cc = cc;
		this.nasc = nasc;
	}
	
	public String getNome(){return nome;}
	public int getCC(){return cc;}
	public Data getNasc(){return nasc;}
	
	public String Nasc_toString(){
		return(nasc.getDia() + "-" + nasc.getMes() + "-" + nasc.getAno());
	}
	
	
	public static int addP(Pessoa[] lista, int size){
}
