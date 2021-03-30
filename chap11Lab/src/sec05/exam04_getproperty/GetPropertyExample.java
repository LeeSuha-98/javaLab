package sec05.exam04_getproperty;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("운영체제 이름: "+osName);
		System.out.println("사용자 이름: "+userName);
		System.out.println("사용자 홈 디렉토리: "+userHome);
		
		System.out.println("------------------------");
		System.out.println("[key] value");
		System.out.println("------------------------");
		
		
		//map 자료구조:{key:value} ex){String타입:String타입} <-Properties
		Properties props = System.getProperties();
		//set 자료구조:
		Set keys = props.keySet();
		for(Object objKey:keys) {
			String key = (String)objKey;
		 String value = System.getProperty(key);
		 System.out.println("["+key+"]"+value);
		}
		
	}

}
