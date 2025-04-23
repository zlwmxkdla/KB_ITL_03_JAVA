package hw20250423.기본.exam12;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String []names = data1.split("&|,");
        for(String s:names){
            System.out.println(s);
        }

        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2,"/");
        while(st.hasMoreTokens()){
            String name = st.nextToken();
            System.out.println(name);
        }
    }
}
