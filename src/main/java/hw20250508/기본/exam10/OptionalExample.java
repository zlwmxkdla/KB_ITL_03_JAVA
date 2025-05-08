package hw20250508.기본.exam10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        double avg;
        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        if(optional.isPresent()){
            System.out.println("방법1_평균: "+ optional.getAsDouble());
        }else{
            System.out.println("방법1_평균: 0.0");
        }

        avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("방법2_평균: "+ avg);

        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a-> System.out.println("방법3_평균: "+a));
    }
}
