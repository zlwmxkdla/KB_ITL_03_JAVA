package hw20250430.exam02;
import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("이유정",24));
        set.add(new Member("홍길동", 32));
        System.out.println("총 객체 수: " + set.size());
    }
}
