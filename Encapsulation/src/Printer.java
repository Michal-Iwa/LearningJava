public class Printer {
    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

     public Printer(int tonerLevel, boolean duplex){
         if(tonerLevel > -1 && tonerLevel <= 100) this.tonerLevel = tonerLevel;
         else tonerLevel = -1;
         this.duplex = duplex;
         this.pagesPrinted = 0;
     }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public boolean getDuplex() {
         return duplex;
    }

    public int printPages(int pagesToPrint){
        if(pagesToPrint < 1) return -1;
        if(duplex) pagesToPrint = pagesToPrint / 2 + pagesToPrint % 2;
        pagesPrinted+=pagesToPrint;
        System.out.print("Printer printed " + pagesToPrint + " pages");
        return pagesToPrint;
    }
    public int addToner(int tonerAmount){
         if(tonerAmount > 0 && tonerAmount <= 100){
             if(tonerAmount + tonerLevel <= 100) {
                 tonerLevel += tonerAmount;
                 return tonerLevel;
             }
         }
         return -1;
    }
    public void fillUpToner(){
         tonerLevel = 100;
         System.out.println("Toner fully filled up!");
    }

}
