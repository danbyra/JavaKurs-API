package Lab02.wyjatki;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź działanie w formacie: składnik znak_działania składnik");
        try
        {
            if (!sc.hasNext())return;
            String arg1=sc.next();
            if (!sc.hasNext())return;
            String znak=sc.next();
            if (!sc.hasNext())return;
            String arg2=sc.next();

            int liczba1=Integer.parseInt(arg1);
            int liczba2=Integer.parseInt(arg2);
            String wynik=switch (znak)
            {
                case "+"->String.valueOf(liczba1+liczba2);
                case "-"->String.valueOf(liczba1-liczba2);
                case "*"->String.valueOf(liczba1*liczba2);
                case "/"->
                {
                    if(liczba2==0)throw new ArithmeticException("BŁĄD: Dzielenie przez 0");
                    yield String.valueOf(liczba1/liczba2);
                }
                default -> throw new IllegalArgumentException("BŁĄD: Wprowadzono błędny znak operacji");
            };
            System.out.println("Wynik działania: "+ wynik);
        }
        catch (NumberFormatException e)
        {
            System.out.println("BŁĄD: Podano argument, który nie jest liczbą całkowitą");
        }
        catch (ArithmeticException  | IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
