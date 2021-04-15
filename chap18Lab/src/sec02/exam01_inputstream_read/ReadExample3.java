package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;
//아예 8바이트로 출력되는 코드
public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[8];
		readByteNo = is.read(readBytes, 2, 3);
		for(int i=0; i<readBytes.length; i++) {
			System.out.println(readBytes[i]);
		}
		is.close();
	}

}
