package Lab01;

import java.io.File;//plik
import java.io.FileNotFoundException;
import java.io.IOException;//wyjątki
import java.util.Scanner;

public class Zad10
{
    public static void main(String[] args) throws IOException {
        File file=new File("dane.txt");
        Scanner input= new Scanner(file);
        while(input.hasNext())
        {
            String imie=input.next();
            String nazwisko=input.next();
            int roboczogodziny=input.nextInt();
            double stawka=input.nextDouble();
            double wynik=stawka*roboczogodziny;
            System.out.printf("Wynagrodzenie dla pracownika: %s %s wynosi %.2f zł \n",imie,nazwisko,wynik);
        }
        input.close();
    }
}
