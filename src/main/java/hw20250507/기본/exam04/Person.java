package hw20250507.기본.exam04;

public class Person {
    public void action(Calculable calculable) {
        double result = calculable.calc(10, 4);
        System.out.println("Result: " + result);
    }
}
