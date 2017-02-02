package finestre1;

import java.util.Scanner;

public class Finestre1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Finestra f;
        int n;
        int x = 0;
        int positionx = 0;
        int positiony = 100;
        do {
            System.out.println("Inserire numero di Finestre da visualizzare:");
            n = input.nextInt();
        } while ((n > 6) || (n < 1));
        for (int i = 0; i < n; i++) {
            f = new Finestra();
            f.setVisible(true);
            f.testo.setText("Sono la Finestra " + (i + 1));
            positionx = positionx + x;
            f.setTitle("Finestra " + (i + 1));
            f.setLocation(positionx, positiony);
            if (i == 2) {
                positionx = 0;
                positiony = 500;
                x = 0;
            } else {
                x = 437;
            }
        }
    }

}
