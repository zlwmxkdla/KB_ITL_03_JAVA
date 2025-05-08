package hw20250508.기본.exam04;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] strArray = {"홍길동","신용권","김미나"};
        Stream<String> stream = Arrays.stream(strArray);
        stream.forEach(item->System.out.println(item+","));
        System.out.println();

        int[] intArray = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(item->System.out.println(item+","));
        System.out.println();
    }
}
