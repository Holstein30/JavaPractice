package Inheritance.Composition;

public class Bed {
    private String size;
    private String type;
    private Dimensions dimensions;

    public Bed(String size, String type, Dimensions dimensions) {
        this.size = size;
        this.type = type;
        this.dimensions = dimensions;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
        System.out.println(type);
        return type;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
