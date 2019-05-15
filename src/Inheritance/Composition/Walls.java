package Inheritance.Composition;

public class Walls {
    private int height;
    private int width;
    private String color;

    public Walls(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public int getArea(){
        return width * height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        System.out.println(color);
        return color;
    }
}
