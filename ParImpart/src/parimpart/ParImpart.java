package parimpart;

public class ParImpart {

    public static void main(String[] args) {
        
        Printer print = new Printer();
        Thread t1 = new Thread(new ParImpar(print, 10, false),"Impar");
        Thread t2 = new Thread(new ParImpar(print, 10, true),"Par");
        t1.start();
        t2.start();
    }
    
}
