package ex1;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		double avg = 0;
		
		for(i = 1; i<=100; i++) {
			sum += i;
			avg = (double)sum/100.00;
		}
		System.out.println("1 ~ 100������ �հ�: " +sum);
		System.out.println("���: "+String.format("%.2f", avg));

		
	}

}
