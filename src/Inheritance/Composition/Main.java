package Inheritance.Composition;

public class Main {

    public static void main(String[] args) {


            Dimensions dimensions = new Dimensions(20, 20, 5);
            Case theCase = new Case("XI7", "Corsair", "Gold", dimensions);
            Monitor monitor = new Monitor("24xl", "Benq", 24, new Resolution(1920, 1080));
            Motherboard motherboard = new Motherboard("Mortar", "AMD", 4, 6, "v1");

            PC pc = new PC(theCase, motherboard, monitor);

            pc.getMonitor().drawPixelAt(10, 20, "cyan");
            pc.getMotherboard().programName("Halo");
            pc.getTheCase().pressPowerButton();



        }
    }
