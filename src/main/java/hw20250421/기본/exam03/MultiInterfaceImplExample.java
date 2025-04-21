package hw20250421.기본.exam03;


public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();

        Searchable searchable = new SmartTelevision();
        searchable.search("http://www.youtube.com");
    }
}
