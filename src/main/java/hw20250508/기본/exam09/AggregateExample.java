package hw20250508.기본.exam09;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Arrays.stream(arr)
                .filter(x->x%2==0)
                .peek(x->System.out.println(x));

        int total = Arrays.stream(arr)
                .filter(a->a%2==0)
                .peek(n-> System.out.println(n))
                .sum();
        System.out.println("총합 : " +total +"\n");
        Arrays.stream(arr)
                .filter(x->x%2==0)
                .forEach(n->System.out.println(n));
    }
}
