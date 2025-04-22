package hw20250422.심화.exam02;

public class ButtonExample {
    public static void main(String[] args) {
        //Ok 버튼 객체 생성
        Button btnOk = new Button();
        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }
        btnOk.setClickListener(new OkListener());
        btnOk.click();
    }
}
