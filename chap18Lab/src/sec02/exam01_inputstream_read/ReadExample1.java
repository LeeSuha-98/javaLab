package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByte;
		while(true) {
			readByte = is.read();
			if(readByte == -1) break; //더 읽을게 없으면 -1로 리턴한다.
			System.out.println((char)readByte);
		}
		is.close();
	}

}
