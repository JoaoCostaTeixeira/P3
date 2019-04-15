package problema1_3;
import java.util.Scanner;

public class Teste {
	static Scanner ler = new Scanner(System.in) ;
	public static void main(String[] args) {
		int b = 0; 
		do{
		 b=0;
		 menu();
		 int a=ler.nextInt();
		 switch(a){
			 case 1:
				 System.out.print("Coordenadas do centro. x:");
				 double x= ler.nextDouble();
				 System.out.print("y:");
				 double y = ler.nextDouble();
				 System.out.print("Raio:");
				 double r = ler.nextDouble();
				 Circulo c = new Circulo(x,y,r);
				 System.out.print(c.toString());
				 break;
			 case 2:
				 System.out.print("Lado:");
				 double l= ler.nextDouble();
				 Quadrado q = new Quadrado(l);
				 System.out.print(q.toString());
				 break;
			 case 3:
				 System.out.print("Comprimento:");
				 double com = ler.nextDouble();
				 System.out.print("Largura:");
				 double lar  = ler.nextDouble();
				 Rectangulo re = new Rectangulo (com, lar);
				 System.out.print(re.toString());
				 break;
			 case 4:
				 System.out.print("CIRCULO 1. Coordenadas do centro. x:");
				 double x1= ler.nextDouble();
				 System.out.print("y:");
				 double y1 = ler.nextDouble();
				 System.out.print("Raio:");
				 double r1 = ler.nextDouble();
				 Circulo c1 = new Circulo(x1,y1,r1);
				 System.out.print("CIRCULO 2.Coordenadas do centro. x:");
				 double x2= ler.nextDouble();
				 System.out.print("y:");
				 double y2 = ler.nextDouble();
				 System.out.print("Raio:");
				 double r2 = ler.nextDouble();
				 Circulo c2 = new Circulo(x2,y2,r2);
				 c1.comparacao(c2);
				 break;
			 default: 
				 System.out.println("Opção impossivel");
				 b=1;
				 break;
		 }
		}while(b!=0);

	}
	public static void menu(){
		System.out.printf("\n\n1-Circulo\n2-Quadrado\n3-Rectangulo\n4-Comparar dois circulos\nOpçao: ");
	}
}