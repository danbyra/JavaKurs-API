package Lab02.wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double liczba=0;
        boolean czySpelnione=false;
        do {
            try {
                System.out.println("Podaj liczbe zmiennoprzecinkową: ");
                liczba=sc.nextDouble();
                czySpelnione=true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("BŁĄD: podano nieprawidłowy ciąg znaków");
                sc.next();
            }

        }
        while (!czySpelnione);
    }
}

