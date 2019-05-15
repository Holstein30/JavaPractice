package Inheritance.Composition;

public class TV {
    private String model;
    private int size;
    private Resolution tvResolution;

    public TV(String model, int size, Resolution tvResolution) {
        this.model = model;
        this.size = size;
        this.tvResolution = tvResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println(color + " pixel drawn at: " + x + ", " + y);
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public Resolution getTvResolution() {
        return tvResolution;
    }

}
