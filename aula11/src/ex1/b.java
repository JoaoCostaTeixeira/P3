package ex1;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class b {
	public static void main(String[] args) throws IOException{
		Path p = Paths.get("C://Users//Staples//Desktop//ECT//P3//aula11//src//ex1//text.txt"); 
		int size=0;
		List<String> lines = Files.readAllLines(p,Charset.defaultCharset());
		
		Set<String> s = new HashSet<String>();
		for(int i=0; i<lines.size();i++){
			String [] ss = lines.get(i).split("\\P{Alpha}+");
			size=size+ss.length;
			for(int j=0; j<ss.length;j++){
				s.add(ss[j]);
			}
		}
		System.out.print("Numero total de palavras: " + size + "\n");
		System.out.print( "Numero de palavras distintas: "+ s.size());
		
	}
}
