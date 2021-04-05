package sec03.exam02_arguments;

public class MyMethodReferencesExample { 
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		
		//劳疙 备泅 按眉 积己
		fi = new MyFunctionalInterface() {

			@Override
			public void method(int x) {
				// TODO Auto-generated method stub
				
			}
		
		
		};
		
		fi= (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(2);
		
		fi = (x) -> { System.out.println(x*5); };
		fi.method(2);
		
		fi = x -> System.out.println(x*5);
		fi.method(2);
	}
}











