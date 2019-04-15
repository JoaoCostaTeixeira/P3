package asd;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class asdd {

	public static void main(String[] args) throws IOException {
			File f = new File("text.txt");
			
			FileWriter out = new FileWriter(f);
			
			out.write("es um burro");
			out.close();
	}

}
