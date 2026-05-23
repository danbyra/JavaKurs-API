package Lab01;

import java.util.Scanner;

public class ZF8
{
   public static void obliczeniaFigurMatematycznych()
   {
       System.out.println("Podaj długdość boku kwadratu");
       Scanner sc = new Scanner(System.in);
       double bok=sc.nextDouble();

       double poleKwadratu=Math.pow(bok,2);
       double obwodKwadratu=4*bok;
       System.out.println("Pole kwadratu wynosi: "+ poleKwadratu);
       System.out.println("Obwód kwadratu wynosi: "+ obwodKwadratu);

       System.out.println("Podaj bok A prostokątu:");
       double bokA=sc.nextDouble();
       System.out.println("Podaj bok B prostokątu: ");
       double bokB=sc.nextDouble();

       double poleProstokata=bokA*bokB;
       double obwodProstokata=(2*bokA)+(2*bokB);
       System.out.println("Pole prostokąta wynosi: "+ poleProstokata);
       System.out.println("Obwód prostokąta wynosi: "+ obwodProstokata);
       System.out.println("Czy bok A oraz bok B są sobie równe; "+ (bokA==bokB));
       sc.close();
   }
}
