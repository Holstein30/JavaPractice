package Inheritance;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean manual;
    private int currentGear;

    public Car(String make, String model, String bodyStyle, int wheels, int doors, int gears, boolean manual) {
        super(make, model, bodyStyle);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.manual = manual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Current Gear = " + this.currentGear);
    }

    public void changeSpeed(int speed, int direction){
        move(speed, direction);
        System.out.println("Car.changeSpeed() : ");
    }

}
