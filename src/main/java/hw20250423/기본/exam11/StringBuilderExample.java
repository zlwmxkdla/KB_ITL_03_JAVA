package hw20250423.기본.exam11;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder().append("DEF").insert(0,"ABC").delete(3,4).toString();
        System.out.println(data);
    }
}
// 프로그램 실행 결과
//ABCEF