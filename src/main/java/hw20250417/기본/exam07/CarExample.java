package hw20250417.기본.exam07;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.tire = new Tire();
        myCar.run();

        myCar.tire=new HankookTire();
        myCar.run();

        myCar.tire=new KumhoTire();
        myCar.run();
    }
}
