package ex3;

import java.nio.ByteBuffer;

class BitmapInfoHeader{
	int size; // the size of this header (40 bytes) 4
	int width; // the bitmap width in pixels 4
	int height; // the bitmap height in pixels 4
	short planes; // the number of color planes being used. Must be set to 1 | 2 
	short bitCount; // the number of bits per pixel (color depth) - 1, 4, 8, 16, 24, 32 | 2
	int compression; // the compression method being used 4
	int sizeImage; // the image size. This is the size of the raw bitmap data 4
	int xPelsPerMeter; // the horizontal resolution of the image (pixel per meter) 4
	int yPelsPerMeter; // the vertical resolution of the image (pixel per meter) 4
	int clrUsed; // the number of colors in the color palette, 4
	// or 0 to default to 2n
	int clrImportant; // the number of important colors used, 4
	// or 0 when every color is important

	public BitmapInfoHeader(byte[] a){
		byte[] t1 = {a[0],a[1],a[2],a[3]};
		this.size = ByteBuffer.wrap(t1).getInt();
		byte[] t2 = {a[4],a[5],a[6],a[7]};
		this.width = ByteBuffer.wrap(t2).getInt();
		byte[] t3 = {a[8],a[9],a[10],a[11]};
		this.height = ByteBuffer.wrap(t3).getInt();
		byte[] t4 = {a[12],a[13]};
		this.planes = ByteBuffer.wrap(t4).getShort();
		byte[] t5 = {a[14],a[15]};
		this.bitCount = ByteBuffer.wrap(t5).getShort();
		byte[] t6 = {a[16],a[17],a[18],a[19]};
		this.compression = ByteBuffer.wrap(t6).getInt();
		byte[] t7 = {a[20],a[21],a[22],a[23]};
		this.sizeImage = ByteBuffer.wrap(t7).getInt();
		byte[] t8 = {a[24],a[25],a[26],a[27]};
		this.xPelsPerMeter = ByteBuffer.wrap(t8).getInt();
		byte[] t9 = {a[28],a[29],a[30],a[31]};
		this.yPelsPerMeter = ByteBuffer.wrap(t9).getInt();
		byte[] t10 = {a[32],a[33],a[34],a[35]};
		this.clrUsed = ByteBuffer.wrap(t10).getInt();
		byte[] t11 = {a[36],a[37],a[38],a[39]};
		this.clrImportant = ByteBuffer.wrap(t11).getInt();
	}
}
