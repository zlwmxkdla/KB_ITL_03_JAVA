package hw20250423.심화.exam02;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        int[] randomnum = new int[6];
        Random random = new Random(3);
        System.out.println("선택한 번호 :");
        for(int i = 0; i < randomnum.length; i++){
            randomnum[i] = random.nextInt(45)+1;
            System.out.print(randomnum[i]+" ");
        }
        System.out.println();

        int[] pick = new int[6];
        random = new Random(5);
        System.out.println("당첨된 번호: ");
        for(int i = 0; i < randomnum.length; i++){
            pick[i] = random.nextInt(45)+1;
            System.out.print(pick[i]+" ");
        }
        System.out.println();

        Arrays.sort(randomnum);
        Arrays.sort(pick);
        boolean same = Arrays.equals(randomnum, pick);
        System.out.println("결과: ");
        if(same){
            System.out.println("당첨!");
        }else{
            System.out.println("낙첨 ㅠㅠ ");
        }
    }
}
