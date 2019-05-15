package Inheritance.Composition;

public class Room {
    private Bed bed;
    private Desk desk;
    private TV tv;
    private Walls walls;

    public Room(Bed bed, Desk desk, TV tv, Walls walls) {
        this.bed = bed;
        this.desk = desk;
        this.tv = tv;
        this.walls = walls;
    }

    public void willTvFit(){
        tvFitTest();
    }

    private boolean tvFitTest(){
        if(walls.getArea() > tv.getSize()){
            return true;
        } else {
            return false;
        }
    }
}
