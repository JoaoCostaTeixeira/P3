package ex3;

import java.nio.*;

class BitmapFileHeader{
	short type; // must be 'BM' to declare a bmp-file 2
	int size; // specifies the size of the file in bytes 4
	short reserved1; // must always be set to zero 2
	short reserved2; // must always be set to zero 2
	int offBits; // specifies the offset from the 4
	// beginning of the file to the bitmap data

	public BitmapFileHeader(byte[] a){
		byte[] t1 = {a[0],a[1]};
		this.type = ByteBuffer.wrap(t1).getShort();
		byte[] t2 = {a[2],a[3],a[4],a[5]};
		this.size = ByteBuffer.wrap(t2).getInt();
		byte[] t3 = {a[6],a[7]};
		this.reserved1 = ByteBuffer.wrap(t3).getShort();
		byte[] t4 = {a[8],a[9]};
		this.reserved2 = ByteBuffer.wrap(t4).getShort();
		byte[] t5 = {a[10],a[11],a[12],a[13]};
		this.offBits = ByteBuffer.wrap(t5).getShort();
	}
}
