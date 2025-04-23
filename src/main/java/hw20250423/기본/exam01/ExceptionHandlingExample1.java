package hw20250423.기본.exam01;

// 기존 프로그램의 문제점 :
// printLength 함수에 null 이 입력되었을 경우의 예외를 처리하는 코드가 없다.
//
// 출력 결과
//Execution failed for task ':hw20250423.기본.exam01.ExceptionHandlingExample1.main()'.
//> Process 'command 'C:\jdk-17\bin\java.exe'' finished with non-zero exit value 1

//예외 처리 추가한 코드
public class ExceptionHandlingExample1 {
    public static void printLength(String data){
        try{
            int result = data.length();
            System.out.println("문자 수: " + result);
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }finally{
            System.out.println("[마무리 실행]\n");
        }
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}