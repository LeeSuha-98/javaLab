package sec04.exam001_objects;

import java.util.Objects;

public class ToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "홍길동";
		String str2 = null;
		
		
		System.out.println(str1.toString());//홍길동
		//System.out.println(str2.toString());//예외 발생
		System.out.println(Objects.toString(str1)); 
		System.out.println(Objects.toString(str1,"이름이 없습니다."));//문자열을 추가해도 홍길동이 나온다.
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2,"이름이 없습니다."));//null이라면 문자열 입력
	}

}
