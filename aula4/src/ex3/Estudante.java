package ex4;

public class Estudante extends cliente {
	private String curso;
	private int nMec;
	public Estudante(String nome, String data,int CC, int nMec, String curso){
		super(nome,CC, data);
		this.curso=curso;
		this.nMec=nMec;
	}
	public int getNmec(){
		return this.nMec;
	}
	public String getCurso(){
		return this.curso;
	}
	@Override
	public String toString() {
		return "Estudante [Curso = " + curso + ", Numero Mecanografico = " + nMec + ", Nome = " + getNome() + ", Data de nascimento = " + getData().toString()
				+ ", CC = " + getCC() + ", Idade = " + getIdade() + "]";
	}
			
}
