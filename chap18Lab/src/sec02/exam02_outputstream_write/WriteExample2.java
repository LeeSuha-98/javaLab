package sec02.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "ABCD".getBytes(); //�̷��� �ϴϱ� ���� ����: this is a test  �̰��� �׽�Ʈ�Դϴ� -> ABCD�� �ٲ�!
		os.write(data);
		os.flush();
		os.close();
	}

}
