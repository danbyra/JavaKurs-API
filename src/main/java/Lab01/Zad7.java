package Lab01;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Przelicznik Celcjusz --> Fahrenheit.");
        System.out.print("Podaj temperaturę w \u00B0C (użyj przecinka): ");

        double temperatura=0;
        if(sc.hasNextDouble())
        {
            temperatura=sc.nextDouble();
        }
        else
        {
            System.out.println("Błąd,wprowadzoną niepoprawną daną");
            System.exit(0);
        }
        double farenheit=temperatura*1.8+32;
        System.out.printf("temperatura %.1f\u00B0C to %.1f\u00B0F",temperatura,farenheit);
        sc.close();
    }
}
