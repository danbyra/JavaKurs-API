package Lab01;

import java.util.Scanner;

public class ZF9 {
    public static void obliczeniaFigurMatematycznychInstrukcjeWarunkowe()
    {
        System.out.println(
                "Wybierz wzór:\nObwód kwadratu:1\n " +
                        "Obwód prostokąta:2\nPole Kwadratu:3\nPole Prostokąta:4"
        );
        Scanner sc = new Scanner(System.in);
        int wybor=sc.nextInt();
        if(wybor==1)
        {
            System.out.println("Podaj długdość boku kwadratu");
            double bok=sc.nextDouble();
            double obwodKwadratu=4*bok;
            System.out.println("Obwód kwadratu wynosi: "+ obwodKwadratu);
        }
        else if (wybor==2)
        {
            System.out.println("Podaj bok A prostokątu:");
            double bokA=sc.nextDouble();
            System.out.println("Podaj bok B prostokątu: ");
            double bokB=sc.nextDouble();
            double obwodProstokata=(2*bokA)+(2*bokB);
            System.out.println("Obwód prostokąta wynosi: "+ obwodProstokata);
            //System.out.println("Czy bok A oraz bok B są sobie równe; "+ (bokA==bokB));
        }
        else if (wybor==3)
        {
            System.out.println("Podaj długdość boku kwadratu");
            double bok=sc.nextDouble();
            double poleKwadratu=Math.pow(bok,2);
            System.out.println("Pole kwadratu wynosi: "+ poleKwadratu);
        }
        else if  (wybor==4)
        {
            System.out.println("Podaj bok A prostokątu:");
            double bokA=sc.nextDouble();
            System.out.println("Podaj bok B prostokątu: ");
            double bokB=sc.nextDouble();

            double poleProstokata=bokA*bokB;
            System.out.println("Pole prostokąta wynosi: "+ poleProstokata);
            //System.out.println("Czy bok A oraz bok B są sobie równe; "+ (bokA==bokB));
        }
        else
        {
            System.out.println("Nie ma takiej opcji wyboru");
        }
        sc.close();
    }
}
