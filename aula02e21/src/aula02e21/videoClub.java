package aula02e21;
import java.util.ArrayList;
import java.util.Scanner;

public class videoClub {
	static Scanner ler = new Scanner(System.in) ;
	public static void main(String[] args) {
		ArrayList<video> filme = new ArrayList<>();
		ArrayList<cliente> client = new ArrayList<>();
		ArrayList<aluger> alug = new ArrayList<>();
		int a=0;
		do{
			menu.menu();
			 a=ler.nextInt();
			
			 switch(a){
				 case 1:
					 ler.nextLine();
					 System.out.print("Titulo do Filme: ");
					 String titulo = ler.nextLine();
					 System.out.print("Categoria: ");
					 String categoria = ler.nextLine();
					 System.out.print("Faixa etária: ");
					 String idade = ler.nextLine();
					 video s = new video(titulo, categoria, idade);
					 filme.add(s);
					 System.out.println(s.toString());
					 break;
				 case 2:
					 boolean verdade=true;
					 int id=0;
					 do{
						 System.out.print("ID do filme: ");
						 id=ler.nextInt();
						 System.out.println(filme.get(id-1).toString());
						 System.out.print("Deseja eliminar este filme(y/n): ");
						 ler.nextLine();
						 String f =ler.nextLine();
						 if(!f.equals("y")) verdade=false;
					 }while(!verdade);
					 filme.remove(id-1);
					 break;
				 case 3:
					 System.out.print("Numero de socio: ");
					 id=ler.nextInt();
					 int i = client.get(id-1).getIdade();
					 for(int j=0; j<filme.size(); j++){
						 if(filme.isEmpty()){
							System.out.println("Não existem filmes disponiveis");
							break;
						 }
						 filme.get(j).listarFilmes(i, j);
					 }
					 break;
				 case 4:
					 System.out.printf("1-Estudante\n2-Funcionário\n");
					 ler.nextLine();
					 int kk = ler.nextInt();
					 switch(kk){
					 	case 1:
					 		String nom;
					 		String nasc;
					 		String curs;
					 		int numMec; 
					 		int cc;
					 		cliente c;
					 		verdade=true;
					 		ler.nextLine();
					 		do{
						 		
						 		System.out.print("Nome:");
						 		nom = ler.nextLine();
						 		System.out.printf("Data de nascimento(dd/mm/aaaa);");
						 		nasc = ler.nextLine();
						 		System.out.printf("Curso");
						 		curs = ler.nextLine();
						 		System.out.printf("CC");
						 		cc = ler.nextInt();
						 		System.out.printf("Numero mecanografico");
						 		numMec = ler.nextInt();
						 		c =  new cliente (nom, cc, nasc,numMec, curs, 0 );
						 		System.out.println(c.toString());
						 		ler.nextLine();
						 		System.out.println("São estas os seus dados?(y/n) ");
						 		String f =ler.nextLine();
								if(!f.equals("y")) verdade=false;
					 		}while(!verdade);	
					 		client.add(c);
					 		break;
					 	case 2:
					 		verdade=true;
					 		do{
						 		ler.nextLine();
						 		System.out.print("Nome:");
						 		nom = ler.nextLine();
						 		System.out.printf("Data de nascimento(dd/mm/aaaa):");
						 		 nasc = ler.nextLine();
						 		System.out.printf("Numero Fiscal:");
						 		int fical = ler.nextInt();
						 		System.out.printf("CC");
						 		cc = ler.nextInt();
						 		System.out.printf("Numero de funcionario");
						 		numMec = ler.nextInt();
						 		c =  new cliente (nom, cc, nasc,numMec, null, fical );
						 		 System.out.println(c.toString());
						 		ler.nextLine();
						 		System.out.println("São estas os seus dados?(y/n) ");
						 		String f =ler.nextLine();
								if(!f.equals("y")) verdade=false;
					 		}while(!verdade);	
					 		client.add(c);
					 		break;
					 	
					 	default:
					 		 System.out.println("Opção impossivel");
							 break; 
					 }
					 break;
					  
				 case 5:
					   	 ler.nextLine();
						 System.out.print("ID do cliente: ");
						 id=ler.nextInt();
						 client.remove(id-1);
						 break;
				 case 6:
					 ler.nextLine();
					 for(int j=0; j<client.size(); j++){
						 if(client.isEmpty()){
							System.out.println("Não existem clientes.");
							break;
						 }
						 client.get(j).listar(j);
					 }
					 break;
				 case 7:
					 ler.nextLine();
					 System.out.print("ID do cliente: ");
					 id=ler.nextInt();
					 System.out.print("ID do filme: ");
					 int id2=ler.nextInt();
					 aluger al= new aluger(filme.get(id2-1), client.get(id-1));
					 alug.add(al);
					 filme.get(id2-1).mudarDispo(false);
					 break;
				 case 8:
					 ler.nextLine();
					 System.out.print("ID do cliente: ");
					 id=ler.nextInt();
					for(int k=0; k<alug.size(); k++){
						if(alug.get(k).clint==client.get(id-1)){
							alug.get(k).vid.mudarDispo(true);
							alug.remove(k);
						}
					}
					break;
				 case 9 : System.exit(1);
					 
				 default: 
					 System.out.println("Opção impossivel");
					 break;
			 }
		}while(a!=5);
	}
}