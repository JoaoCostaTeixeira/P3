package aula1;
import java.util.*;
public class Principal {
	static Scanner ler = new Scanner(System.in) ;
	public static void main (String args[]) {
		System.out.print("Introduza a frase:	");
		String frase=ler.nextLine();
		Metodos frasemet = new Metodos(frase);
		int num = frasemet.numeros();
		System.out.printf("Existem %d números\n", num);
		if(frasemet.minusculas()){
			System.out.println("Exitem apenas letras minusculas");
		}else if (frasemet.maiusculas()){
			System.out.println("Exitem apenas letras maiusculas");
		}
}
}