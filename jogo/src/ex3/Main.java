package ex3;

import java.io.IOException;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) throws IOException{ //Lê a imagem
		
		
//		Scanner sc = new Scanner(System.in);
//		String n = sc.nextLine()
		Bitmap bmp = new Bitmap("C://Users//Staples//Desktop//ECT//P3//jogo//src//ex3//Figura.bmp"); //Trocar isto depois 
		byte[] x = new byte[ bmp.data.length];
		//System.out.println(bmp.data.length);
		for(int i=0;i< bmp.data.length;i++){
			x[i]=(bmp.data[i]);
		}
		
		new Interface(bmp.data,Integer.reverseBytes(bmp.bitmapInfoHeader.width) , -Integer.reverseBytes(bmp.bitmapInfoHeader.height) );
//		sc.close();
	}
}
