package verify.exam08;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String  str = "���̵�,�̸�,�н�����";

		// �ۼ� ��ġ
		// #1: split() �޼ҵ� �̿뤷
		String [] str1 = str.split(",");
		for(String s : str1)
			System.out.println(s);
		
		System.out.println();
		
		// #2: StringTokenizer �̿�
		StringTokenizer str2 = new StringTokenizer("���̵�,�̸�,�н�����",",");
		while(str2.hasMoreTokens()){
			String s = str2.nextToken();
			System.out.println(s);
		}
		//
	}
	
}
// ���� �������
// ���̵�
// �̸�
// �н�����
//
// ���̵�
// �̸�
// �н�����