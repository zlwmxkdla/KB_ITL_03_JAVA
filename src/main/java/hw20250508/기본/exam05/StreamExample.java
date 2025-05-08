package hw20250508.기본.exam05;

import java.util.stream.IntStream;

public class StreamExample {
    public static int sum;
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1,100);
        stream.forEach(a->sum+=a);
        System.out.println("총합: "+sum);
    }
}
