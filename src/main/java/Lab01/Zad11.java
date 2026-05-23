package Lab01;

import java.util.Scanner;

public class Zad11
{
    public static final String[] days = {"niedziela", "poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota"};

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj datę format dd.mm.rrrr: ");
        String date = sc.next();

        int dzien=Integer.parseInt(date.substring(0,2));
        int miesiac=Integer.parseInt(date.substring(3,5));
        int rok=Integer.parseInt(date.substring(6,10));

        int z,c;
        if(miesiac==1 || miesiac==2)
        {
            z=rok-1;
            c=0;
        }
        else
        {
            z=rok;
            c=2;
        }
        int dt=(23*miesiac/9+dzien+4+rok+z/4-z/100+z/400-c)%7;
        if(dt <0)
        {
            dt+=7;
        }
        System.out.printf("Data %s to %s.\n", date, days[dt]);
        sc.close();
    }
}
