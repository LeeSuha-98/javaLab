package sec04.exam001_objects;

import java.util.Objects;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer o1 = 1000;
		Integer o2 = 1000;
		
		//Objects.equals.
		
		System.out.println(Objects.equals(o1, o2));//true
		
		Integer[]arr1 = {1,2};
		Integer[]arr2 = {1,2};
		
		System.out.println(Objects.equals(arr1, arr2));//false
	}

}
