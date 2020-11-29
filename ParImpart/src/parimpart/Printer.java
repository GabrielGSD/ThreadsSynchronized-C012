package parimpart;

public class Printer {
    
    private volatile boolean isImpar;

    void printPar(int number) {
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isImpar = false;
    }
    
    void printImpar(int number) {
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isImpar = true;
    }
    
}
