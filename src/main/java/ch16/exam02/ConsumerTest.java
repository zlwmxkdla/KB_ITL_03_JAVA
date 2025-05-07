package ch16.exam02;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        //Consumer 계열 : 매개변수 o, 반환형 x
        //매개변수를 소비

        //익명 클래스
        Consumer<String> printString = new Consumer<String>() {
            @Override
            public void accept(String s1) {
                System.out.println("s1 = " + s1);
            }
        };

        printString.accept("지금은 2시 11분");

        //람다식으로 변경
        Consumer<String> pringString2 = (s2)->{
            System.out.println("s2 = " + s2);
        };

        pringString2.accept("람다식으로 변경 성공!!");

        //BiConsumer<T, U> : 매개변수 T, U 두개 소비
        BiConsumer<String,Integer> printNameAge
                = (s1, age) -> System.out.println("s1 = " + s1);

        printNameAge.accept("홍길동",25);



    }
}
