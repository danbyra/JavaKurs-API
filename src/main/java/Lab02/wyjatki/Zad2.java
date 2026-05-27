package Lab02.wyjatki;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma=0;
        int licznik=0;
        System.out.println("Podaj 5 licz całkowitych: ");
        while(licznik<5)
        {
            String wejscie=sc.next();
            try
            {
                int liczba=Integer.parseInt(wejscie);
                suma+=liczba;
                licznik++;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Wprowadzono inny ciąg niż liczba całkowita. POMIJAM");
            }
        }
        System.out.println("Suma wprowadzonych liczb całkowitych: "+ suma);
    }
}
