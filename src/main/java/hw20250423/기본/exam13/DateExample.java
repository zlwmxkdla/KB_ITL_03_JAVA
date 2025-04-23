package hw20250423.기본.exam13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
        String now = date.toString();
        System.out.println(now);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String now2 = sdf.format(date);
        System.out.println(now2);
    }
}
