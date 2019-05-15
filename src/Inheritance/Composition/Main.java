package Inheritance.Composition;

public class Main {

    public static void main(String[] args) {


            Dimensions dimensions = new Dimensions(30, 25, 5);
            Desk desk = new Desk("wood", dimensions);
            TV tv = new TV("Samsung", 55, new Resolution(40, 50));
            Bed bed = new Bed("King", "Water", new Dimensions(60, 36, 12));
            Walls walls = new Walls(120, 120, "green");

            Room room = new Room(bed, desk, tv, walls);

            room.willTvFit();
            room.getWalls().getColor();
            room.getTv().drawPixelAt(200, 200, "yellow");
            room.getBed().getType();
            room.getDesk().getMaterial();


        }
    }
