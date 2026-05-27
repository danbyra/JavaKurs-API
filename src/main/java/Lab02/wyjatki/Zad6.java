package Lab02.wyjatki;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj 2 liczby całkowite: ");
        String dzielnaString=sc.next();
        String dzielnikString=sc.next();
        try {
            int dzielna=Integer.parseInt(dzielnaString);
            int dzielnik=Integer.parseInt(dzielnikString);
            System.out.printf("%d:%d = %d r. %d\n",dzielna,dzielnik,dzielna/dzielnik,dzielna%dzielnik);
        }
        catch(NumberFormatException e)
        {
            System.out.println("BŁĄD: Jedna z wprowadzonych danych nie jest liczbą całkowitą");
        }
        catch(ArithmeticException e)
        {
            System.out.println("BŁĄD: Dzielenie przez 0");
        }
    }
}
