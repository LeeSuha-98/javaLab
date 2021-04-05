package ex2;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	int[] arr = new int[5];
	int sum = 0;
	
	System.out.println("정수 5개를 입력하세요");
	for(int i = 0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
		sum += arr[i];
		
		
		  if(sum >= 1000) {
	        	System.out.println("프로그램 종료!");
	        	break;
	        	
	        }else {
	System.out.println("입력: "+arr[i]+" 합: "+sum);
	
	}
}
	}
}
	
		// TODO Auto-generated method stub
		/*int i = 0;
		int sum = 0;
		
		System.out.print("숫자를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
       i = sc.nextInt();
        
	
	while(sum!=0){
        sum += i%10;
        i /= 10;
        
        if(sum >= 100) {
        	System.out.println("프로그램 종료!");
        	break;
        	
        }else {
        	
        	System.out.println("입력: "+i);
            System.out.println("합: "+sum);
           
           
           
        }
    }

	}
*/

