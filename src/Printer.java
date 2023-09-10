public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(boolean duplex) {
        this(0,0,duplex);
    }
    private Printer (int tonerLevel, int pagesPrinted, boolean duplex){
        this.tonerLevel=tonerLevel;
        this.pagesPrinted= pagesPrinted;
        this.duplex= duplex;
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

    public int addToner(int tonerAmount){
        int totalAmount=this.tonerLevel+tonerAmount;
        if(totalAmount>100||totalAmount<0) {
            return -1;
        } else {
            this.tonerLevel=totalAmount;
            return totalAmount;
        }
    }
    public void printPages(int pages){
        if(this.duplex){
            System.out.println("its duplex printer");
            this.pagesPrinted+=pages/2;
        } else {
            this.pagesPrinted+=pages;
        }
    }
}
