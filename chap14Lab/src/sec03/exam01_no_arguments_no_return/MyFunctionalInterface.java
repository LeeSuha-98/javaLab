package sec03.exam01_no_arguments_no_return;


//함수적 인터페이스 : 추상 메소드가 하나인 경우를 말한다.
@FunctionalInterface
public interface MyFunctionalInterface {
    public void method();
   // public void method2();람다식은 함수인터페이스기 떄문에 추상 메소드가 하나임
    
}

