package sec03.stream_pipelines;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30),
				new Member("김나리", Member.FEMALE, 20),
				new Member("신용권", Member.MALE, 45),
				new Member("박수미", Member.FEMALE, 27)
		);
		
		double ageAvg =   list.stream()
				//중간처리
				
			//.filter(m -> m.getSex()==Member.MALE)
				.filter(new Predicate<Member>() {

					@Override
					public boolean test(Member m) {
						// TODO Auto-generated method stub
						return  m.getSex()==Member.MALE;
					}
					
				})
				//람다식=> .mapToInt(m->m.getAge())
			.mapToInt(Member :: getAge)
			.average()
			.getAsDouble();
		
		System.out.println("남자 평균 나이: " + ageAvg);
	}
}


