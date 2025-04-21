package hw20250421.기본.exam02;

public class Television implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Tv를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {

        if(volume > MAX_VOLUME){
            this.volume=RemoteControl.MAX_VOLUME;
        }else if(volume < MIN_VOLUME){
            this.volume=RemoteControl.MIN_VOLUME;
        }else{
            this.volume=volume;
        }
        System.out.println("현재 TV 볼륨 : " + volume);
    }
}
