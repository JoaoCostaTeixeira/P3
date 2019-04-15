package ex1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class d {

	public static void main(String[] args) throws IOException {
		Map<String, Integer> mapa = new TreeMap<>();
		Path p = Paths.get("C://Users//Staples//Desktop//ECT//P3//aula11//src//ex1//text.txt"); 
		List<String> lines = Files.readAllLines(p,Charset.defaultCharset());
		
		for(int i=0; i<lines.size();i++){
			String [] ss = lines.get(i).split("\\P{Alpha}+");
			for(int j=0; j<ss.length;j++){
				if(mapa.containsKey(ss[j])){
					mapa.put(ss[j],mapa.get(ss[j])+1);
				}else{
					mapa.put(ss[j],1);
				}
			}
		}
		
		Set<Entry<String, Integer>> set = mapa.entrySet();
		Iterator<Entry<String, Integer>> i = set.iterator();
		
		while(i.hasNext()) {
			Entry<String, Integer> aux = i.next();
			System.out.println("" + aux.getKey() + " - " + aux.getValue() + " vezes");
		}
	}
}


