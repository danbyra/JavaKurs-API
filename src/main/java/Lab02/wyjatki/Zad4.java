package Lab02.wyjatki;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        String s=sc.next();
        try {
            int liczba=Integer.parseInt(s);
            if(liczba==0) throw new ArithmeticException("BŁĄD: Nie istnieje odwrotnośc dla 0");
            double liczbaOdwrotna= 1.0/liczba;
            System.out.printf("Dla liczby: "+ liczba+ " liczba odwrotna to: %.2f",liczbaOdwrotna);
        }
        catch (NumberFormatException e)
        {
            System.out.println("BŁĄD: Podano inny ciąg niż liczba całkowita");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
