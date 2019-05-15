package Inheritance.Composition;

import java.awt.*;

public class Desk {
    private String material;
    private Dimensions dimensions;

    public Desk(String material, Dimensions dimensions) {
        this.material = material;
        this.dimensions = dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
