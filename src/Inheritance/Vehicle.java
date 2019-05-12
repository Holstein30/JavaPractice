package Inheritance;

public class Vehicle {
    private String make;
    private String model;
    private String bodyStyle;

    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String make, String model, String bodyStyle) {
        this.make = make;
        this.model = model;
        this.bodyStyle = bodyStyle;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Current Direction = " + currentDirection);
    }

    public void move(int speed, int direction){
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("Current Speed = " + currentSpeed + " Current Direction = " + currentDirection);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentSpeed = 0;
    }
}
