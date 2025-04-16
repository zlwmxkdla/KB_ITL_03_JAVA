package hw20250416.기본.exam06;

public class Calculator {
    int x,y;

    public Calculator() {
        this.x=x;
        this.y=y;
    }

    void powerOn(){
        System.out.println("전원을 켭니다.");
    }

    public int plus(int a, int b){
        return a+b;
    }

    public double divide(int a, int b){
        double result = (double)a/(double)b;
        return result;
    }

    void powerOff(){
        System.out.println("전원을 끕니다.");
    }
}
