package ex4;

public class funcionario extends cliente {
	private int numFiscal;
	private int numFuncio;
	public funcionario (String nome, String data,int CC, int numFiscal, int numFuncio){
		super(nome,CC, data);
		this.numFiscal=numFiscal;
		this.numFuncio=numFuncio;
	}
	public int getNumFical(){
		return this.numFiscal;
	}
	public int getNumFuncio(){
		return this.numFuncio;
	}
	@Override
	public String toString() {
		return "funcionario [Numero Fiscal =" + numFiscal + ", Numeto de Funcionario = " + numFuncio + ", Nome = " + getNome()
				+ ", Data de Nascimento = " + getData().toString() + ", CC = " + getCC() + ", Idade = " + getIdade() + "]";
	}		
	
	
}
