package ex2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class test {

	public static void main(String[] args) throws IOException {
		Path p = Paths.get("text.txt");
		List<String> lines = Files.readAllLines(p,Charset.defaultCharset());
		LinkedList<String> aux2 = new LinkedList<>();
		HashMap<Pares, Integer> lista = new HashMap<>();
		
		for(int i=0; i<lines.size();i++){
			String [] aux = lines.get(i).split("[ .,?!]"); // stack overflow
			for(int j=0; j<aux.length;j++){
				if(aux[j].length()>2){
					aux2.addLast(aux[j].toLowerCase());
				}
			}
			
			do{
				Pares pp = new Pares(aux2.removeFirst(), aux2.getFirst());
				if(lista.containsKey(pp)){
					lista.put(pp,  lista.get(pp) + 1 );
				}else{
					lista.put(pp, new Integer(1) );
				}
			}while(aux2.size()>1);
		}
		print(lista);

	}
	private static void print(HashMap lista){
		Set<Pares> p = lista.keySet();
		for(Pares n : p){
			System.out.println(n.s1 + "={" + n.s2 + "=" + lista.get(n) + "}");
		}
	}

}
