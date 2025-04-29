package hw20250429.심화.exam01;

public class GenericExample {
    public static <T> Box<T> boxing(T t)  {
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }
    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int intvalue = box1.get();
        System.out.println(intvalue);

        Box<String> box2 = boxing("홍길동");
        String stringvalue = box2.get();
        System.out.println(stringvalue);
    }
}
