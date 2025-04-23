package hw20250423.기본.exam09;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        int sum = 0;
        for(int i=0; i<100000; i++) {
            sum += i;
        }
        long time2 = System.nanoTime();

        System.out.println("합: "+sum);
        System.out.println("소요 시간: "+(time2-time1));
    }
}
