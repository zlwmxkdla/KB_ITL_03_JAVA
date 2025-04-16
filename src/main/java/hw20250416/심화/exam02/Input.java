package hw20250416.심화.exam02;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);
    String read(String title){
        System.out.print(title);
        return scanner.nextLine();
    }
    String read(String title, String defaultValue) {
        System.out.print(title);
        return scanner.nextLine();
    }
    int readInt(String title) {
        System.out.print(title);
        return scanner.nextInt();
    }
    boolean confirm(String title, boolean defaultValue) {
        System.out.print(title);
        if(defaultValue) {
            System.out.print("Y");
        }else{
            System.out.print("N");
        }
        return defaultValue;
    }
    boolean confirm(String title) {
        return confirm(title, false);
    }
}
