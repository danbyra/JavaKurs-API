package Lab02.wyjatki;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        if (sc.hasNextInt()) {
            int liczba = sc.nextInt();
            if (liczba == 0) System.out.println("BŁĄD: Nie istnieje odwrotnośc dla 0");
            else
            {
                double liczbaOdwrotna = 1.0 / liczba;
                System.out.printf("Dla liczby: " + liczba + " liczba odwrotna to: %.2f", liczbaOdwrotna);
            }
        }
        else
        {
            System.out.println("Wprowadzono inny ciąg niż liczba całkowita.");
        }
    }
}
