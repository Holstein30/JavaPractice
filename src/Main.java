import jdk.jshell.Diag;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(10, false);
        printer.getPagesPrinted();
        printer.getTonerLevel();
        printer.isDuplex();
        printer.printPage();
        printer.printPage();
        printer.getPagesPrinted();
        printer.getTonerLevel();
        printer.fillToner();
        printer.getTonerLevel();

    }
}

