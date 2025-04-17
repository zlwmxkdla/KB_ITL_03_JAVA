package hw20250417.기본.exam09;

public class PhoneExample {
    public static void main(String[] args) {
        //Phone phone = new Phone; -> 추상 클래스이기 때문에 객체 생성 불가능
        SmartPhone smartphone = new SmartPhone("홍길동");
        smartphone.turnOn();
        smartphone.internetSeach();
        smartphone.turnOff();
    }
}
