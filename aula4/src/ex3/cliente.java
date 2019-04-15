package ex4;

public class cliente {
	private String nome;
	private data dataNascimento;
	private int CC;
	
	public cliente(String nome, int CC, String data){
		this.nome=nome;
		String [] aux = data.split("/");
		int i1 = Integer.parseInt(aux[0]);
		int i2 = Integer.parseInt(aux[1]);
		int i3 = Integer.parseInt(aux[2]);
		dataNascimento = new data(i1, i2, i3);
		this.dataNascimento=dataNascimento;
		this.CC=CC;
	}
	
	public String getNome(){
		return this.nome;
	}
	public data getData(){
		return this.dataNascimento;
	}
	public int getCC(){
		return this.CC;
	}
	public int getIdade(){
		return getData().getIdade();
	}
	
	
	
}
