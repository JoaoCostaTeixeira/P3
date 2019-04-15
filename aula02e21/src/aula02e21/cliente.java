package aula02e21;
import java.util.*;

public class cliente {
	private String nome;
	private String dataNascimento;
	private String curso;
	private int CC;
	private int numMec_Func;
	private int numFiscal; 
	
	public cliente(String nome, int CC, String dataNascimento,int numMec_Func, String curso, int numFiscal){
		this.nome=nome;
		this.dataNascimento=dataNascimento;
		this.curso=curso;
		this.CC=CC;
		this.numMec_Func=numMec_Func;
		this.numFiscal=numFiscal;
		
	}
		
	public int getIdade(){
		String [] aux = this.dataNascimento.split("/");
		int idade = Integer.parseInt(aux[2]);
		return 2016-idade;
	}
	
	public void listar(int ID){
		System.out.printf("%d - %s\n", ID+1, this.nome);
	}

	@Override
	public String toString() {
		return "nome = " + nome + ", data de nascimento = " + dataNascimento + ", curso = " + curso + ", CC = " + CC
				+ ", Numero Mec ou de Func = " + numMec_Func + ", Numero Fiscal = " + numFiscal;
	}
}