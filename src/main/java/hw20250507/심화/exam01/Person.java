package hw20250507.심화.exam01;



public class Person {
    public void action(Calcuable calculable) {
        double result = calculable.calc(10,4);
        System.out.println("result: " + result);
    }
}
