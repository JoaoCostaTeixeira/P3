package galo;
public class JogodoGalo {

	public static void main(String[] args) {
		if(args.length==1){
			new jogo(args[0]);
		}else{
			double x = Math.random();
			if(x<0.5){
				new jogo("O");
			}else{
				new jogo("X");
			}
		}
		
		

	}

}
