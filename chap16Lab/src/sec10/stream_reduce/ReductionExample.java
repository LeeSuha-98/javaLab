package sec10.stream_reduce;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 92),
				new Student("신용권", 95),
				new Student("감자바", 88)
		);
		
		int sum1 = studentList.stream()
				.mapToInt(Student :: getScore)//중간처리:매핑(Student -> intStream)
				.sum(); //최종처리:합계
		
		int sum2 = studentList.stream()
				.map(Student :: getScore) //중간처리:매핑
				.reduce((a, b) -> a+b)//최종처리:합계기능을 구현한다.
				.get();
		
		int sum3 = studentList.stream()
						.map(Student :: getScore)
						.reduce(0, (a, b) -> a+b);//identy0은 초기값으로 사용한다.
		
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
		System.out.println("sum3: " + sum3);
	}
}
