package sec11.exam01_arrays;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr1 = {'J','A','V','A'};
		//방법1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));//j,a,v,a가 출력된다.
		
		//방법2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3)); //a,v가 출력된다
		//0,4 하면 java출력
		
		//방법3
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for(int i=0; i<arr4.length; i++) {
			System.out.println("arr4["+i+"]="+arr4[i]); //0에는j 1에는a 2에는v 3에는a가 입력되어 있는것을 확인할 수 있다.
		}
	}

}
