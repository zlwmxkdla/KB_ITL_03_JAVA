package hw20250430.exam05;
import java.util.*;
public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> stack = new Stack<Coin>();

        stack.push(new Coin(10));
        stack.push(new Coin(100));
        stack.push(new Coin(50));
        stack.push(new Coin(5000));

        while(!stack.isEmpty()){
            Coin now = stack.pop();
            System.out.println("꺼낸 동전: "+now.getValue()+"원");
        }
    }
}
