public class Printer {
    private int tonerLevel = 10;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel > 0 || tonerLevel <= 10){
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        System.out.println("Toner Level = " + tonerLevel);
        return tonerLevel;
    }

    public int getPagesPrinted() {
        System.out.println("Pages printed = " + pagesPrinted);
        return pagesPrinted;
    }

    public boolean isDuplex() {
        System.out.println("Duplex = " + duplex);
        return duplex;
    }

    public void fillToner(){
        System.out.println("Toner Filled");
        this.tonerLevel = 10;
    }

    public void printPage(){
        if(this.tonerLevel > 0){
            System.out.println("Page Printed - Toner Decreased");
            this.pagesPrinted += 1;
            this.tonerLevel -= 1;
        } else {
            System.out.println("Not enough toner");
        }
    }
}
