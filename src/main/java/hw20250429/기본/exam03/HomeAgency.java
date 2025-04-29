package hw20250429.기본.exam03;

public class HomeAgency implements Rentable<Home> {
    @Override
    public Home rent(){
        return new Home();
    }
}
