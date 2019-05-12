package Inheritance;

public class Miata extends Car {
    private int warrantyMonths;

    public Miata(int warrantyMonths) {
        super("Mazda", "Miata", "Convertible", 4, 2, 6, true);
        this.warrantyMonths = warrantyMonths;
    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed() + rate;
        if(newSpeed == 0){
            stop();
            changeGear(1);
        } else if(newSpeed > 0 && newSpeed <= 15){
            changeGear(1);
        } else if(newSpeed <= 30){
            changeGear(2);
        } else if(newSpeed <= 45){
            changeGear(3);
        } else if(newSpeed <= 60){
            changeGear(4);
        } else if(newSpeed <= 75){
            changeGear(5);
        }else {
            changeGear(6);
        }

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
