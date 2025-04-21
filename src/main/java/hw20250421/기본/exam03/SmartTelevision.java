package hw20250421.기본.exam03;


public class SmartTelevision implements RemoteControl,Searchable {


    public SmartTelevision() {
        super();
    }

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
    @Override
    public void search(String url) {
        System.out.println(url+"을 검색합니다.");
    }
}
