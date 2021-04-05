package ex3;

import java.util.Scanner;

public class SignPrint {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);;
		System.out.println("변수 num을 입력하세요.");
		int num = sc.nextInt();
	
		System.out.println( "변수 num은 "+( num >= 0 ? (num == 0 ? "0" : "양수") : "음수" )+"입니다."); 

		
	}
}
