package Lab01;

import java.util.Scanner;

public class Zad8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Obliczanie długości przeciwprostokątnej");
        System.out.print("Podaj długość pierszej przyprostokątnej: ");
        double a=0;
        if(input.hasNextDouble())
        {
            a=input.nextDouble();
        }
        else
        {
            System.out.print("Wprowadzono nieprawidłową wartośc dla pierszej przyprostokątnej");
            input.close();
            return;
        }

        System.out.print("Podaj długość drugiej przyprostokątnej: ");
        double b=0;
        if(input.hasNextDouble())
        {
            b=input.nextDouble();
        }
        else
        {
            System.out.print("Wprowadzono nieprawidłową wartośc dla drugiej przyprostokątnej");
            input.close();
            return;
        }
        double wynik= Math.sqrt(a*a+b*b);
        System.out.printf("Długośc przeciwprostokątnej wynosi: %.3f",wynik);
    }
}
