package sec07.exam02_method;

public class StringValueOfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = String.valueOf(10); //10 -> "10", 참조형 <- 기본형
		String str2 = String.valueOf(10.5);//10.5 -> "10.5"
		String str3 = String.valueOf(true);//true -> "true"
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		

	}

}
