package ex3;

import java.util.Scanner;

public class SignPrint {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);;
		System.out.println("���� num�� �Է��ϼ���.");
		int num = sc.nextInt();
	
		System.out.println( "���� num�� "+( num >= 0 ? (num == 0 ? "0" : "���") : "����" )+"�Դϴ�."); 

		
	}
}
