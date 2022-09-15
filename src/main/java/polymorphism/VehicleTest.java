package polymorphism;



public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle vehicle = (Vehicle) car;
        Car car2 = (Car) vehicle;
//        MotorBike motorBike = (MotorBike) car;
    }
}
class Vehicle{
    String model;
    String color;
    int wheels;

    void startEngine() {
        System.out.println("시동걸기");
    }
    void accelerate() {
        System.out.println("속도 올리기");
    }
    void brake() {
        System.out.println("브레이크!");
    }
}
class Car extends Vehicle{
    void giveRide(){
        System.out.println("다른사람 태우기");
    }
}
class MotorBike extends Vehicle{
    void performance(){
        System.out.println("묘기 부리기");
    }
}
