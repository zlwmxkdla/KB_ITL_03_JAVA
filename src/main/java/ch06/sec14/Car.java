package ch06.sec14;

public class Car {
    //필드 선언
    private int speed;
    private boolean stop;



    public Car(int speed, boolean stop) {
        this.speed = speed;
        this.stop = stop;
    }

    //speed 필드의 Getter/Setter 선언

    public int getSpeed() {
        System.out.println("stop = " + stop);
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}
