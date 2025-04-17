package hw20250417.기본.exam02;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Computer computer = new Computer();
        int r = 10;
        System.out.println("원 면적: "+ calc.areaCircle(r));
        System.out.println();
        System.out.println("원 면적: "+ computer.areaCircle(r));
        System.out.println();
    }
}
