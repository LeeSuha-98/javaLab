package sec06.exam01_class;

import sec05.exam05_getenv.SysyemEnvExample;

public class ClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Class clazz1 = car.getClass(); //??ü.getClass()?? ?ش? ??ü?? Class ??ü?? ???´?.
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		try {
			//Class.forName()?? ?ش? ??ü?? Class??ü?? ???´?.
			Class clazz2 = Class.forName("sec06.exam01_class.Car");
			
		}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}


