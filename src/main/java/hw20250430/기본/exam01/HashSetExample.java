package hw20250430.exam01;
import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBATIS");
        int size = set.size();
        System.out.println("총 객체수: " + size);

    }
}

//실행 결과
// 총 객체 수 : 4