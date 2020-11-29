package parimpart;


public class PrinterComControle {
    
    private volatile boolean isImpar;

    synchronized void printPar(int number) {
        while (!isImpar) {
            try {
                wait(); //Fica em espera até a outra Thread dar um notify()
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isImpar = false;
        notify();
    }
    
    synchronized void printImpar(int number) {
        while (isImpar) {
            try {
                wait(); //Fica em espera até a outra Thread dar um notify()
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isImpar = true;
        notify();
    }
    
}
