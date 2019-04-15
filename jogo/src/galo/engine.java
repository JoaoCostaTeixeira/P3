package galo;
public class engine{
	private String [] a = new String[9];
	private String jogada;
	
	public engine(String x){
		jogada=x;
		for(int i=0; i<9;i++){
			a[i]="N";
		}
	}
	
	public String getJogada(){
		return jogada;
	}
	public void turn(){
		if(jogada.equals("X")){
			jogada="O";
		}else{
			jogada="X";
		}
	}
	public String check_winner(){
		
		
		for(int i=0; i<9; i=i+3){
			if(a[i].equals(a[i+1]) && a[i+1].equals(a[i+2])  && !a[i].equals("N")) return a[i];		
		}
		for(int i=0; i<3; i++){
			if(a[i].equals(a[i+3]) && a[i+3].equals(a[i+6]) && !a[i].equals("N")) return a[i];
		}
		if(a[0].equals(a[4]) && a[4].equals(a[8]) && !a[0].equals("N")) return a[0];
		if(a[2].equals(a[4]) && a[4].equals(a[6]) && !a[2].equals("N")) return a[2];
		
		for(int i=0; i<9; i++){
			if(a[i].equals("N")){
				return "N";				//o problema apareceu quando acrescentei este codigo
			}
		}
		return "E";  
		
		
	}
	
	public void set(int x, String s){
		a[x]= s;
	}
	
	
	

}
