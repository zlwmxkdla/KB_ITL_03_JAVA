package hw20250508.심화.exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        System.out.println(new Student("홍길동",85));
        System.out.println(new Student("홍길동",92));
        System.out.println(new Student("홍길동",87));

        students.stream()
                .mapToInt(s->s.getSore())
                .forEach(score-> System.out.println(score));
    }
}
