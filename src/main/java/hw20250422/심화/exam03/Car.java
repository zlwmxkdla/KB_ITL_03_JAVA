package hw20250422.심화.exam03;

public class Car {
    //필드에 Tire 객체 대입
    private Tire tire1 = new Tire();

    private Tire tire2 = new Tire(){
        @Override
        public void roll(){
            System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
        }
    };
    //메소드(필드 이용)
    public void run1(){
        tire1.roll();
        tire2.roll();
    }
    public void run2(){
        Tire tire = new Tire(){
            @Override
            public void roll(){
                System.out.println("익명 자식 Tire 객체 2가 굴러갑니다.");
            }
        };
        tire.roll();
    }
    public void run3(Tire tire){
        tire.roll();
    }
}
