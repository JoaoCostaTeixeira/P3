package ex1;

import ex1.Data;

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
	
	public String toString(){
		return(getNome()+"	" + getCC() + "	"+nasc.getDia() + "-" + nasc.getMes() + "-" + nasc.getAno());
	}
}
