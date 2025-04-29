package hw20250429.기본.exam03;

public class CarAgency implements Rentable<Car>{
    @Override
    public Car rent(){
        return new Car();
    }
}
