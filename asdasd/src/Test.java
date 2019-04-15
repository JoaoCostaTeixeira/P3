

import java.util.*;

public class Test {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
        a.add("As aventuras do tintin");
        a.add("O diario de Bridget Jones");
        a.add("A lua de joana");
        a.add("Fundamentos de enfermagem");
        minHashing Um = new minHashing(a,3);
        int[] lst = Um.initHashBuckets();
        
        
        System.out.println("Lista 1: \n Nr HashFunctions: 3");
        System.out.println("    As aventuras do tintin");
        System.out.println("    O diario de Bridget Jones");
        System.out.println("    A lua de joana");
        System.out.println("    Fundamentos de enfermagem");
         
        List<String> b = new ArrayList<String>();
        b.add("As aventuras do tintin");
        b.add("O diario de Bridget Jones");
        b.add("A lua de joana");
        b.add("Fundamentos de enfermagem");
        minHashing Dois = new minHashing(b,4);
        int[] array = Dois.initHashBuckets();
         
        System.out.println("Lista 2: \n Nr de HashFunctions: 4");
        System.out.println("    As aventuras do tintin");
        System.out.println("    O diario de Bridget Jones");
        System.out.println("    A lua de joana");
        System.out.println("    Fundamentos de enfermagem");
       System.out.printf("\nlista 'um' com lista 'dois' -> listas iguais, diferente Nr de HashFunctions : %.2f de similaridade",minHashing.similarity(lst,array)*100); //false -> lista "a" com lista "b" -> listas iguais, diferente Nr de HashFunctions
	}

}
