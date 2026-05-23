package Lab01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Zf11 {
    public static void tabliceJednowymiarowe()
    {
        // deklaracja albo int[]array albo int array[]

        //przypisanie wartośc do tablicy 1D
        int[]tab= new int[10];
        int[]tab2={1,2,3,4,5,6};
        double[]tabb3=new double[]{10,18,11,17};
        //dodanie wartości do tablcy
        tab[0]=10;
        tab[1]=20;
        tab[2]=30;
        tab[3]=40;

        //arayList
        ArrayList<Integer>listaInt=new ArrayList<>();
        //rozmiar dostosowywany automatycznie, podobnie jak w c#
        //jedynie można tworzyć na typach referencyjnych
        //Dodanie do listy
        listaInt.add(100);
        listaInt.add(200);
        listaInt.add(300);
        System.out.println("Wyświetlenie Array list"+listaInt);
        System.out.println("Wyświetlenie drugiego elementu: "+listaInt.get(1));
        //usuniecie z listy
        listaInt.remove(0);
        System.out.println("Wyświetlenie tablicy po usunięciu indeksu 0"+listaInt);
        //Ważne w sumie to to, że lista jest porządkowana, czyli jak się jej używa i bierze na sztywno
        //jakas daną, a potem się ja usunię to wskaże na co innego albo poza zakres więc warto to mieć
        // na uwadze

        //teścik biblioteki arrays
        System.out.println("Wyświetlenie tablicy typów prymitywnych za pomocą Arrays"+Arrays.toString(tabb3));
        Arrays.sort(tabb3);
        System.out.println("Wyświetlenie tablicy typów prymitywnych za pomocą Arrays po sortowaniu"+Arrays.toString(tabb3));

    }


}
