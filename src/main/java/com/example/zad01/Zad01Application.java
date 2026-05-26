package com.example.zad01;
import Lab01.FractionDB;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class Zad01Application {

    public static void main(String[] args) throws IOException {
        //SpringApplication.run(Zad01Application.class, args);
        // System.out.println("Hello World!");

        /*ZADANIA Z PLIKU .pdf API*/

        //Lab01.Zad1.main(args);
        //Lab01.Zad2.main(args);
        //Lab01.Zad3.main(args);
         //Lab01.Zad4.main(args);
        //Lab01.Zad5.main(args);
        //Lab01.Zad6.main(args);
        //Lab01.Zad7.main(args);
        //Lab01.Zad8.main(args);
        //Lab01.Zad9.main(args);
        //Lab01.Zad10.main(args);
        //Lab01.Zad11.main(args);

        /*Zadania z kursu*/
        //Lab01.ZF2.main(args);
        //Lab01.ZF4.main(args);
        //Lab01.ZF6.main(args);
        //Lab01.ZF7.main(args);
        //Lab01.ZF8.obliczeniaFigurMatematycznych();
        //Lab01.ZF9.obliczeniaFigurMatematycznychInstrukcjeWarunkowe();
        //Lab01.ZF10.obliczeniaFigurMatematycznychInstrukcjeSwitch();
        //Lab01.Zf11.tabliceJednowymiarowe();
        //Lab01.Zf12.petleWhileDoWhile();
        //Lab01.ZF13.petleForForEach();
        //Lab01.ZF14.tabliceDwuwymiarowe();

        /*Zadanie Fraction*/
        FractionDB fraction= new FractionDB(1,5);
        System.out.println("TESTY ZADANIE 1");
        System.out.println("Wyświetlenie ułamka: "+fraction);
        fraction.setNum(7);
        System.out.println("Zmiana wartości licznika na 7 i go wyciągniecie gettrem: "+ fraction.getNumerator());
        fraction.setDen(10);
        System.out.println("Zmiana mianownika na 10 i wyciągnięcie go getterem: "+ fraction.getDenominator());
        fraction.setFrac(1,5);
        System.out.println("Przywrócenie stanu początkowego za pomocą settera zbiorczego: "+fraction);
        System.out.println("** Test wyrzucenia wyjątku **");
        System.out.println("Wprowadzenie błędnej danej do konstruktora, mianownik =0: ");
        try {
            FractionDB fraction2= new FractionDB(1,0);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Wprowadzenie błędnej danej za pomocą settera mianownika, mianownik = -5: ");
        try {
            FractionDB fraction3= new FractionDB(1,5);
            fraction3.setDen(-5);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Wprowadzenie błędnej danej za pomocą settera zbiorczego, mianownik = -10: ");
        try {
            FractionDB fraction4= new FractionDB(1,5);
            fraction4.setFrac(2,-10);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("TESTY ZADANIE 2");
        FractionDB fraction5= new FractionDB();
        System.out.println("Wywołanie konstruktora bezargumentowaego: "+ fraction5);
        FractionDB fraction6= new FractionDB(20);
        System.out.println("Wywołanie konstruktora jednoargumentowego: "+ fraction6);

        System.out.println("TESTY ZADANIE 3");
        FractionDB a=new FractionDB(6,36);
        FractionDB b=new FractionDB(a);
        FractionDB c=a;
        System.out.println("Zawartość obiektu a, wywołanego konstruktorem dwuargumentowym: "+a);
        System.out.println("Zawartość obiektu b, wywołanego konstruktorem kopiującym: "+b);
        System.out.println("Zawartość obiektu c, wywołanego przypisaniem: "+c);
        System.out.println("Porównanie a oraz b za pomoca == "+(a==b)); //powinno wyjść false, bo tworzomy nowy obiekt
        System.out.println("Porównanie a oraz c za pomoca == "+(a==c)); //powinno wyjśc true, bo c przechowuje referencje do tego samego co a

        System.out.println("TESTY ZADANIE 4");
        FractionDB fraction7= new FractionDB(-10,-20);
        System.out.println("Test korekcji dla danych (-10,-20): "+ fraction7);
        fraction7.setFrac(-20,20);
        System.out.println("Test korekcji dla danych (-20,20): "+ fraction7);
        FractionDB fraction8= new FractionDB(20,-20);
        System.out.println("Test korekcji dla danych (20,-20): "+ fraction8);

        System.out.println("TESTY ZADANIE 5");
        try
        {
            FractionDB fraction9= new FractionDB(10,30);
            System.out.println("Test redukcji przy danych początkowych (10,30): "+ fraction9);
            fraction9.equivalent(11);
            System.out.println("Test rozszerzenia ułamka przez liczbe 11: "+fraction9);
            fraction9.reduce(11);
            System.out.println("Test skrócenia ułamka przez metodę parametryczną reduce: "+fraction9);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("TESTY ZADANIE 6");
        try
        {
            FractionDB fraction10= new FractionDB(10,20);
            FractionDB fraction11= new FractionDB(1,5);
            FractionDB result =fraction10.multiplication(fraction11);
            System.out.println("Test mnożenia dla danych (10,20) oraz (1,5): "+ result);
            result=fraction10.multiplication(5);
            System.out.println("Test mnożenia dla danych (10,20) przez liczbe 5: "+ result);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("TESTY ZADANIE 7");
        try
        {
            FractionDB fraction100= new FractionDB(10,20);
            FractionDB fraction110= new FractionDB(10,20);
            System.out.println("Test metody statycznej, 2 ułamki: "+ FractionDB.product(fraction100, fraction110));
            System.out.println("Test metody statycznej, ułamek oraz liczba całkowita 9: "+ FractionDB.product(fraction100,9));
            System.out.println("Test metody statycznej, liczba całkowita 9 oraz ułamek: "+FractionDB.product(9,fraction100));
            System.out.println("Test metody statycznej, 2 liczby jako ułamki: "+ FractionDB.product(2,3));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("TESTY ZADANIE 8");
        FractionDB ułamek1 = new FractionDB(12, 27);
        FractionDB ułamek2 = new FractionDB(20, 45);
        System.out.println("Test porównania == "+ (ułamek1==ułamek2));
        System.out.println("Test porównania metoda equals() "+ (ułamek1.equals(ułamek2)));

        System.out.println("TESTY ZADANIE 9");
        FractionDB ułameczek= new FractionDB(1,2);
        System.out.println("Wartość ułaka: "+ ułameczek);
        System.out.println("test doubleValue() "+ ułameczek.doubleValue());
        System.out.println("test toDouble() "+ FractionDB.toDouble(ułameczek));
        System.out.println("test floatValue() "+ ułameczek.floatValue());
        System.out.println("test toFloat() "+ FractionDB.toFloat(ułameczek));

        System.out.println("TEST ZADANIE 10");
        FractionDB s1 = new FractionDB("5");
        System.out.println("Tekst \"5\"    -> Obiekt: " + s1);
        FractionDB s2 = new FractionDB("4/7");
        System.out.println("Tekst \"4/7\"  -> Obiekt: " + s2);
        FractionDB s3 = new FractionDB("2.45");
        System.out.println("Tekst \"2.45\" -> Obiekt: " + s3);
        FractionDB s4 = new FractionDB("2,45");
        System.out.println("Tekst \"2,45\" -> Obiekt: " + s4);
        try
        {
            FractionDB sBlad = new FractionDB("nie_ulamki");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("TEST ZADANIE 11");
        FractionDB v1 = FractionDB.valueOf(7);
        System.out.println("valueOf(7)            -> Wynik: " + v1);
        FractionDB v2 = FractionDB.valueOf(24, 36);
        System.out.println("valueOf(24, 36)       -> Wynik: " + v2);
        FractionDB v3 = FractionDB.valueOf("2.45");
        System.out.println("valueOf(\"2.45\")       -> Wynik: " + v3);
        FractionDB v4 = FractionDB.valueOf(1.5f);
        System.out.println("valueOf(1.5f)         -> Wynik: " + v4);
        FractionDB v5 = FractionDB.valueOf(0.25);
        System.out.println("valueOf(0.25)         -> Wynik: " + v5);

        System.out.println("TEST ZADANIE 12");
        // 2,4115 --> 4823/2000
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz swój ułamek: ");
        if (scanner.hasNext()) {
            String wejscie = scanner.next();
            try {
                FractionDB ulemekUzytkownika = FractionDB.valueOf(wejscie);
                System.out.println("Wprowadzony ułamek: " + ulemekUzytkownika);
            } catch (IllegalArgumentException e) {
                System.out.println(">>> BŁĄD: Wpisano nieprawidłowy format " + e.getMessage());
            }
        }
    }

}
