package Inheritance.Composition;

public class Walls {
    private int height;
    private int width;

    public Walls(int height, int width) {
        this.height = height;
        this.width = width;
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
}
