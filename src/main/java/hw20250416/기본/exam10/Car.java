package hw20250416.기본.exam10;

public class Car {
    String model;
    int speed;

    public Car(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void run(){
        this.setSpeed(100);
        System.out.println(this.model+"가 달립니다.(시속:"+this.speed+")km/h");
    }
}
