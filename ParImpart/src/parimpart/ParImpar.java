package parimpart;

public class ParImpar implements Runnable {
    
    private int max;
    private PrinterSemControle print;
    private boolean isPar; 

    ParImpar(PrinterSemControle print, int i, boolean b) {
        this.max = i;
        this.print = print;
        this.isPar = b;
    }
    
    @Override
    public void run() {
        //Operador ternário
        int number = isPar ? 2 : 1;
        while (number <= max) {
            if (isPar) {
                print.printPar(number);
            } else {
                print.printImpar(number);
            }
            number += 2;
        }
    }
}
