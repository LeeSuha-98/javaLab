package ex2;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	int[] arr = new int[5];
	int sum = 0;
	
	System.out.println("���� 5���� �Է��ϼ���");
	for(int i = 0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
		sum += arr[i];
		
		
		  if(sum >= 1000) {
	        	System.out.println("���α׷� ����!");
	        	break;
	        	
	        }else {
	System.out.println("�Է�: "+arr[i]+" ��: "+sum);
	
	}
}
	}
}
	
		// TODO Auto-generated method stub
		/*int i = 0;
		int sum = 0;
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
        Scanner sc = new Scanner(System.in);
       i = sc.nextInt();
        
	
	while(sum!=0){
        sum += i%10;
        i /= 10;
        
        if(sum >= 100) {
        	System.out.println("���α׷� ����!");
        	break;
        	
        }else {
        	
        	System.out.println("�Է�: "+i);
            System.out.println("��: "+sum);
           
           
           
        }
    }

	}
*/

