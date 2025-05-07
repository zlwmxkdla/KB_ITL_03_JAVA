package ch16.exam02;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        //Supplier 계열 : 매개변수 x, 반환형 o
        // 값을 제공

        //Supplier<T> : T 제공
        Supplier<String> nameSupplier = ()->{return "신짱구";};
        System.out.println("name : " + nameSupplier.get());

        // IntSupplier : int 타입 제공
        IntSupplier randomSupplier = ()->{
            Random random =  new Random();

            return random.nextInt(100);
        };

        System.out.println("random : " + randomSupplier.getAsInt());
        System.out.println("random : " + randomSupplier.getAsInt());
        System.out.println("random : " + randomSupplier.getAsInt());
    }
}
