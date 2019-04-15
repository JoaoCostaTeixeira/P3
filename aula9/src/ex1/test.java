package ex1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class test {

	public static void main(String[] args) {
		ScannerAbeirense sc;
		
		//Path p = Paths.get("texto.txt");
		// sc = new ScannerAbeirense(p);		ficheiro
		
		sc = new ScannerAbeirense("aveiro, universidade, vvvv");
		
		System.out.print(sc);
		
		
	}

}
