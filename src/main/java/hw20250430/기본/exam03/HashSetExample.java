package hw20250430.exam03;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
            if(element.equals("Java"))iterator.remove();
        }
        set.remove("JSP");
        for(String element:set){
            System.out.println(element);
        }
    }
}
