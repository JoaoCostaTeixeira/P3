package ex1;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Test{
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("voos.txt");
		Path p2 = Paths.get("Companhias.txt");
		Path p3 = Paths.get("Infopublico.txt");
		
		List<String> lines = Files.readAllLines(p,Charset.defaultCharset());	//leitura dos 2 ficheiros
		List<String> lines2 = Files.readAllLines(p2,Charset.defaultCharset());
		ArrayList<String> lines3 = new ArrayList<String>();
		ArrayList<String> c = new ArrayList<String>();
		ArrayList<String> s2 = new ArrayList<String>();	
		ArrayList<Voo> voos = new ArrayList<Voo>();
		for(int i=1; i<lines2.size(); i++){
			String[] aux = lines2.get(i).split("\t");				
			c.add(aux[0]);
			s2.add(aux[1]);
		}
		
		
		
		String auxxx = "Hora\tVoo\tCompanhia\tOrigem\tAtraso\tObs\n";
		System.out.print(auxxx);
		lines3.add(auxxx);
 		for(int i=1; i<lines.size(); i++){
			String[] aux = lines.get(i).split("\t");
			Voo v;
			
			String s = Character.toString(aux[1].charAt(0)) +  Character.toString(aux[1].charAt(1)); 
			int y = c.indexOf(s);
			String x = s2.get(y);
			
			if(aux.length==4){
				v = new Voo(aux[0], aux[1], aux[2], aux[3], x);
			}else{
				 v = new Voo(aux[0], aux[1], aux[2], "", x);
			}
			voos.add(v);
			System.out.println(v);
			lines3.add(v.toString());
		}
 		Files.write(p3, lines3, Charset.forName("UTF-8"));
 		
 		
 		// media de atraso
 		
 		ArrayList<Integer> [] media = new ArrayList[c.size()];
 		for(int i=0; i<c.size(); i++){
 			media[i] = new ArrayList<Integer>();
 		}
 		
 		for(int i=0; i<voos.size();i++){
 			int x = s2.indexOf(voos.get(i).getNome());
 			media[x].add(voos.get(i).atraso());
 		}
 		System.out.println("\n\n\nAtraso media por companhia:\n");
 		for(int i=0; i<c.size(); i++){
 			System.out.println(s2.get(i) + " "+ atrasostring(mediaatraso(media[i])));
 		}
 		
 		
 		
 		//Voos por cidade
 		
 		Path p4 = Paths.get("cidades.txt");
 		
 		ArrayList<Integer> ppp = new ArrayList<Integer>();
 		ArrayList<String> ori = new ArrayList<String>();
 		ArrayList<String> lines4 = new ArrayList<String>();
 		lines4.add("Origem\tVoos\n");
 		
 		for(int i=0; i<voos.size();i++){
 			String aux = voos.get(i).getOrigem();
 			if(ori.contains(aux)){
 				ppp.set(ori.indexOf(aux), ppp.get(ori.indexOf(aux))+1);
 				lines4.set(ori.indexOf(aux)+1,ori.get(ori.indexOf(aux)) +"	" + ppp.get(ori.indexOf(aux))+"\n");
 			}else{
 				ori.add(aux);
 				ppp.add(1);
 				lines4.add(ori.get(ori.indexOf(aux)) +"	" + ppp.get(ori.indexOf(aux))+"\n");
 			}
 			
 		}
 		
 		
 		Files.write(p4, lines4, Charset.forName("UTF-8"));
 		
 		
 		
 		
	}
	public static double mediaatraso(ArrayList <Integer> aux){
			double soma=0;
			for(int i=0; i<aux.size();i++){
				soma=soma + aux.get(i);
			}
			double media=soma/aux.size();
		
		return media;
		
	}
	public static String atrasostring(double media){
		int horas = (int) (media/60);
		int minutos = (int) (media-horas);
		
		return horas+ ":" + minutos;
	}
	
}
