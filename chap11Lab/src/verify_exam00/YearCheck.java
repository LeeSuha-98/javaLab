package verify_exam00;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {

	public static void main(String[] args) {

	
			System.out.print("������ �Է� �ϼ���?");
			Scanner sc = new Scanner(System.in);
			
			int year = sc.nextInt();
			GregorianCalendar year1 = new GregorianCalendar();
			if(year1.isLeapYear(year)) {
				System.out.println(year+" �� ����");
				
			}else {
				System.out.println(year+" �� ���");
			}
			}
}