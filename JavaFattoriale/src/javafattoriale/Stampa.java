package javafattoriale;

public class Stampa extends Thread {

    private int n;
    private int ris;

    public Stampa(int num) {
        this.n = num;
        this.ris=0;
    }

    public void run() {
        ris = n;
        for (int i = 1; i < n; i++) {
            ris = ris * i;
        }
        System.out.println("-" + ris);
    }
}
