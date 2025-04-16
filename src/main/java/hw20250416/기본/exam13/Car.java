package hw20250416.기본.exam13;

public class Car {
    private int speed;
    private boolean stop;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(this.speed <=0)this.speed = 0;
        else{
            this.speed = speed;
        }
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        if(stop)this.speed = 0;
    }

    public static class CarExample {
        public static void main(String[] args) {
            Car myCar = new Car();
        }
    }
}
