package Lab01;

import java.util.Scanner;

public class Zad9
{
    public static void main(String[] args)
    {
        String s="Jan Nowak 150 25,3";
        Scanner input=new Scanner(s);
        String imie=input.next();
        String nazwisko=input.next();
        int roboczogodziny=input.nextInt();
        double stawka=input.nextDouble();

        double wynik=stawka*roboczogodziny;
        System.out.printf("Wynagrodzenie dla pracownika: %s %s wynosi %.2f zł",imie,nazwisko,wynik);
        input.close();
    }
}
