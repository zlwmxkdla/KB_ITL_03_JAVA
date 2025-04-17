package hw20250417.기본.exam06;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1="data1";
        parent.method1();
        parent.method2();
        //다음 두 줄의 코드는 실행 불가능 -> 삭제
//        parent.field2="data2";
//        parent.method3();

        Child child = (Child)parent;
        child.field2="data2";
        child.method3();
    }
}
