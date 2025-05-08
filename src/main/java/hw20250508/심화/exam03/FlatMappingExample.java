package hw20250508.심화.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("this is java");
        list1.add("i am a best developer");
        list1.stream()
                .flatMap(data-> Arrays.stream(data.split(" ")))
                .forEach(word-> System.out.println(word));
        System.out.println();

        List<String> list2 = Arrays.asList("10, 20, 30","40, 50");
        list2.stream()
                .flatMapToInt(data->{
                    String[] strarr = data.split(",");
                    int[] intarr = new int[strarr.length];
                    for(int i=0;i<strarr.length;i++){
                        intarr[i] = Integer.parseInt(strarr[i].trim());
                    }
                    return Arrays.stream(intarr);
                })
                .forEach(data-> System.out.println(data));
    }
}
