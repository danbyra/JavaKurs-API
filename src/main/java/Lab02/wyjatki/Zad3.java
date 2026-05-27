package Lab02.wyjatki;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma=0;
        int licznik=0;
        System.out.println("Podaj 5 licz całkowitych: ");
        while(licznik<5)
        {
            if(sc.hasNextInt())
            {
                int liczba=sc.nextInt();
                suma+=liczba;
                licznik++;
            }
            else
            {
                System.out.println("Wprowadzono inny ciąg niż liczba całkowita. POMIJAM");
                sc.next();
            }
        }
        System.out.println("Suma wprowadzonych liczb całkowitych: "+ suma);
    }
}
