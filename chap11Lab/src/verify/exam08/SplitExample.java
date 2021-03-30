package verify.exam08;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String  str = "아이디,이름,패스워드";

		// 작성 위치
		// #1: split() 메소드 이용ㅇ
		String [] str1 = str.split(",");
		for(String s : str1)
			System.out.println(s);
		
		System.out.println();
		
		// #2: StringTokenizer 이용
		StringTokenizer str2 = new StringTokenizer("아이디,이름,패스워드",",");
		while(str2.hasMoreTokens()){
			String s = str2.nextToken();
			System.out.println(s);
		}
		//
	}
	
}
// 실행 결과ㅇㄹ
// 아이디
// 이름
// 패스워드
//
// 아이디
// 이름
// 패스워드