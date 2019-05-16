import jdk.jshell.Diag;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

    Player player = new Player();

    player.name = "Nako";
    player.health = 100;
    player.weapon = "Bow";

    int damage = 50;

    player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthRemaining());
        

    }
}
