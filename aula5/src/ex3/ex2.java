package ex3;
import java.util.*;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Pessoa> lista = new ArrayList();
		int menu = 0;
		int size = 0;
		do{
			menu();
			menu = sc.nextInt();
			switch (menu) {
	         	case 1:  
	         		System.out.print("1-Adicionar apartir de ficheiro\n2-Adicionar manualmente:");
	         		int x=sc.nextInt();
	         		switch(x){
	         			case 1:
	         			case 2:
	         		}
	         		break;
		        case 2:  
		        	if(size != 0){
		        		size = remP(lista, size);
		        	}else{
		        		System.out.print("Lista Vazia");
		        	}
		        	break;
		        case 3:  listP(lista, size);
		        	break;
		        case 4:  listOP(lista, size);
		        	listP(lista, size);
		        	break;
		        case 5:  listOC(lista, size);
		        	listP(lista, size);
		        	break;
		        case 6:  System.out.println("Terminado!");
		        break;
		        default: System.out.println("Entrada errada");
		        break;
			 }
		}while(menu != 6);
		sc.close();
		
	}
	
	public static void menu(){
		System.out.printf("\n1) Adicionar pessoa\n2) Remover pessoa\n3) Lista de pessoas\n4) Lista de pessoas (por ordem alfabética)\n5) Lista de pessoas (por ordem crescente de nº de CC) \n6) Terminar\n");
	}
	
	
	
	public static int remP(Pessoa[] lista, int size){
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Introduza o nome de quem pretende remover:");
		String r_nome = sc4.nextLine();
		int temp_size = size;
		for(int i = 0; i < size; i++){
			if(lista[i].getNome().equals(r_nome)){
				lista[i] = new Pessoa(null, 0, null);
				temp_size--;
			}
		}
		return temp_size;
	}
	
	public static void listP(Pessoa[] lista, int size){
		for(int i = 0; i < size; i++){
			if(lista[i] != null){
				if(!(lista[i].getNome().equals(null))){
					System.out.println("Nome: " + lista[i].getNome() + "|| Nº de CC: " + lista[i].getCC() + "|| Data de Nascimento: " + lista[i].Nasc_toString());
				}
			}
		}
	}
	
	public static void listOP(Pessoa[] lista, int size){
		 boolean troca = true;
		 int j = 0;
		 Pessoa tmp;
		 while (troca) {
			 troca = false;
			 j++;
			 for (int i = 0; i < size - j; i++) {
				 if (lista[i].getNome().compareTo(lista[i + 1].getNome()) > 0) {
					 tmp = lista[i];
					 lista[i] = lista[i + 1];
					 lista[i + 1] = tmp;
					 troca = true;
				 }
			 }
		 }
	}
	
	public static void listOC(Pessoa[] lista, int size){
		boolean troca = true;
		 int j = 0;
		 Pessoa tmp;
		 while (troca) {
			 troca = false;
			 j++;
			 for (int i = 0; i < size - j; i++) {
				 if (lista[i].getCC() > lista[i + 1].getCC()) {
					 tmp = lista[i];
					 lista[i] = lista[i + 1];
					 lista[i + 1] = tmp;
					 troca = true;
				 }
			 }
		 }
		
	}
}
