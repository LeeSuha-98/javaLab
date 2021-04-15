package sec02.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "ABCD".getBytes(); //이렇게 하니깐 원래 내용: this is a test  이것은 테스트입니다 -> ABCD로 바뀜!
		os.write(data);
		os.flush();
		os.close();
	}

}
