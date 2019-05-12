package Inheritance;

public class Main {

    public static void main(String[] args) {

        Miata miata = new Miata(48);

        miata.steer(45);
        miata.accelerate(30);
        miata.accelerate(30);
        miata.stop();
        miata.accelerate(0);

        }
    }
