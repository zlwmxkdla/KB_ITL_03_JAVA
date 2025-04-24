package hw20250424.심화.exam01;

public class MovieThread extends Thread{
    @Override
    public void run() {
        for(int i=1;i<3;i++){
            System.out.println("동영상을 재생합니다.");
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
