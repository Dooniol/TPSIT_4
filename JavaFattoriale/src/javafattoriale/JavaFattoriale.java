package javafattoriale;

public class JavaFattoriale {

    public static void main(String[] args) {
        for (int x = 0; x < 10; x++) {
            Stampa f = new Stampa(x);
            f.start();
        }
    }

}
