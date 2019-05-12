package Inheritance;

public class Miata extends Car {
    private int warrantyMonths;

    public Miata(int warrantyMonths) {
        super("Mazda", "Miata", "Convertible", 4, 2, 6, true);
        this.warrantyMonths = warrantyMonths;
    }
}
