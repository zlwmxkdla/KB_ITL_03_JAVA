package hw20250422.기본.exam02;

public class AExample {
    public static void main(String[] args) {
        //A 객체 생성
        A a = new A();

        //A 인스턴스 메소드 호출
        a.useB();
    }
}
//예상 출력 결과
//B-생성자 실행
//1
//B-method1 실행
//2
//B-method2 실행