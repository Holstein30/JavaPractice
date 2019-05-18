public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void fillToner(){
        this.tonerLevel = 10;
    }

    public void printPage(){
        if(this.tonerLevel > 0){
            this.pagesPrinted += 1;
            this.tonerLevel -= 1;
        } else {
            System.out.println("Not enough toner");
        }

    }
}
