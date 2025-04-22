package hw20250422.기본.exam05;

public class ButtonExample {
    public static void main(String[] args) {
        Button b = new Button();
        //ClickListener 구현 클래스(로컬 클래스)
        class OkListener implements Button.ClickListener{
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }

    }
}

