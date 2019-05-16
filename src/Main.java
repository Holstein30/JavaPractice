import jdk.jshell.Diag;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        EnhancedPlayer player = new EnhancedPlayer("Nako", 50, "Bow");
        System.out.println(player.getHealth());

        int damage = 50;

        player.loseHealth(damage);



    }
}
