package ch17.ex01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class DelayOperation {
    public static void main(String[] args) throws InterruptedException {
        //지연 연산
        //최종 연산이 수행되기 전까지 중간 연산은 실행되지 않음
        List<String> names = Arrays.asList("신짱구","훈이","유리","김철수");
        //filter, map은 중간 연산
        Stream<String> namesStream = names.stream()
                .filter(name->{
                    System.out.println("filter : "+name);
                    return name.length()>2;
                })//신짱구, 김철수
                .map(name ->{
                    System.out.println("map : "+name);
                    return name + "님";
                });
        Thread.sleep(3000);

        //최종 연산 호출

        namesStream.forEach(System.out::println);
    }
}
