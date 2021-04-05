package sec04.exam01_field;

public class UsingThisExample {
	public static void main(String... args) {
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();//인스턴스 멤버 클래스의 인스턴스 생성
		inner.method();
	}
}

