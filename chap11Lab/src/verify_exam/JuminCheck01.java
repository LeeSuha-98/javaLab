package verify_exam;

import java.io.InputStream;
import java.util.Scanner;

public class JuminCheck01 {
	// 주민번호 타당성 검사하는 메소드
	public boolean juminCheck(String jumin) {
		//작성 위치
		int[] mul = {2,3,4,5,6,7,8,9,2,3,4,5};		
		int total = 0;
		int total2;
		
		for(int i=0; i<12; i++) {
			total += Integer.parseInt(jumin.substring(i,i+1))*mul[i];
			
		}
		total %= 11;
		
		
		total2 = 11 - total;
		if(total2 >= 10) {
			total2 %= 10; //total2 = total2 % 10;
		}
		if(total2 != Integer.parseInt(jumin.substring(12,13))) {
			return false;
		}else {
			return true;
		}
		
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JuminCheck01 jc = new JuminCheck01();
		InputStream is = System.in;
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 앞자리를 입력 하세요?");
		String jumin1 = sc.next(); // 111111
		System.out.println("주민번호 뒷자리를 입력 하세요?");
		String jumin2 = sc.next(); // 1111011
		if (jumin1.length() != 6) {
			System.out.println("주민번호 앞자리는 6자리 입력");
		} else if (jumin2.length() != 7) {
			System.out.println("주민번호 뒷자리는 7자리 입력");
		} else if (!jc.juminCheck(jumin1 + jumin2)) {
			System.out.println("잘못된 주민번호 입니다.");
		} else {
			System.out.println("올바른 주민번호 입니다");
		}
	}
}
