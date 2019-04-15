package ex3;

import java.io.*;

public class Bitmap{
	BitmapFileHeader bitmapFileHeader;
	BitmapInfoHeader bitmapInfoHeader;
	byte[] rgbQuad; // color pallete – opcional (ver abaixo)
	byte[] data; // pixel data
	
	public Bitmap(String nome) throws IOException{
		File fin = new File(nome);
		RandomAccessFile file = new RandomAccessFile(fin, "r");
		byte[] tempHeader = new byte[14];
		byte[] tempInfo = new byte[40];
		data = new byte[(int)(file.length() - 54)];
		file.seek(0);
		file.read(tempHeader);
		bitmapFileHeader = new BitmapFileHeader(tempHeader);
		file.seek(14);
		file.read(tempInfo);
		bitmapInfoHeader = new BitmapInfoHeader(tempInfo);
		file.seek(54);
		file.readFully(data);
		file.close();
	}
}

