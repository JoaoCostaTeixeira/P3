package ex1;

import java.util.List;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;

public class ScannerAbeirense implements Iterator<String>, Closeable{
	
	private int indice;
	List<String> lines = new ArrayList<String>();
	
	public ScannerAbeirense(String s){
		indice=0;
		lines.add(s);
	}
	
	public ScannerAbeirense(Path p){
		indice=0;
		 try {
			lines = Files.readAllLines(p,Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String Transforma(){
		String fra="";
		String aux;
		char c;
		while(hasNext()){
			aux= nextLine();
			for(int i=0; i<aux.length(); i++){
				c=aux.charAt(i);
				if(c=='v'){
					c='b';
				}
				if(aux.charAt(i)=='V'){
					c='B';
				}
				
				fra=fra+c;
			}
			fra=fra+"\n";
		}
		return fra;
	}
	
	
	@Override
	public String toString() {
		return Transforma();
	}

	public boolean hasNext() {
		return (indice < lines.size());
	}
	
	public String nextLine() {
		if (hasNext()) {
			String r = lines.get(indice);
			indice++;
			return r;
		}
		throw new IndexOutOfBoundsException("only "+ lines.size() + " elements");
		}
	
	public void remove() {
		throw new UnsupportedOperationException("Operação não suportada!");
	}

	public void close() throws IOException {
		
	}

	public String next() {
		throw new UnsupportedOperationException("Operação não suportada!");
	}
	
	
}
