package Lab04.UtworzKolekcjeZadanie;

import java.util.Iterator;

public class TestyKolekcji {
    public static void testKontener01(){
        System.out.println("*******TESTY DLA KONTENER 01*******");
        Kontener01 kontener=new Kontener01(2);
        kontener.set(0,10);
        kontener.set(1,20);
        System.out.println("Wyświetlenie zawartości kontenera: ");
        for (int i = 0; i < kontener.size(); i++) {
            System.out.printf("Element [%d], wartość: %d \n",i,kontener.get(i));
        }
        kontener.set(4,40); //W tym momencie powinien nastąpić resize tablicy
        System.out.println("Wyświetlenie zawartości kontenera dla resize, rozmiar: "+ kontener.size());
        for (int i = 0; i < kontener.size(); i++) {
            System.out.printf("Element [%d], wartość: %d \n",i,kontener.get(i));
        }
    }
    public static void testKontener02(){
        System.out.println("*******TESTY DLA KONTENER 02*******");
        Kontener02 kontener=new Kontener02(2);
        kontener.set(0,"Test");
        kontener.set(1,20.5);
        System.out.println("Wyświetlenie zawartości kontenera: ");
        for (int i = 0; i < kontener.size(); i++) {
            System.out.printf("Element [%d], wartość: %s \n",i,kontener.get(i));
        }
        //Wymuszenie resizu kolekcji
        kontener.set(2,40);
        kontener.set(3,true);
        kontener.set(4,false);

        System.out.println("Wyświetlenie zawartości kontenera dla resize, rozmiar: "+ kontener.size());
        for (int i = 0; i < kontener.size(); i++) {
            System.out.printf("Element [%d], wartość: %s \n",i,kontener.get(i));
        }
        System.out.println("Test metody toString(): "+ kontener);

        //Dane testowe dla metody equals
        Kontener02 kopia=new Kontener02(5);
        kopia.set(0,"Test");
        kopia.set(1,20.5);
        kopia.set(2,40);
        kopia.set(3,true);
        kopia.set(4,false);
        System.out.println("Test metody equals(): "+ kontener.equals(kopia));

        Kontener02 kopiaFalse=new Kontener02(5);
        kopiaFalse.set(0,"Test");
        kopiaFalse.set(1,20.5);
        kopiaFalse.set(2,40);
        kopiaFalse.set(3,true);
        kopiaFalse.set(4,true);
        System.out.println("Test metody equals() dla różnych danych: "+ kontener.equals(kopiaFalse));
    }
    public static void testKontener03(){
        System.out.println("*******TESTY DLA KONTENER 03*******");
        Kontener03 kontener=new Kontener03(2);
        kontener.set(0,"Test");
        kontener.set(1,"Dla");
        System.out.println("Wyświetlenie zawartości kontenera: ");
        for (int i = 0; i < kontener.size(); i++) {
            System.out.printf("Element [%d], wartość: %s \n",i,kontener.get(i));
        }
        //Wymuszenie resizu kolekcji
        kontener.set(2,40.5);
        kontener.set(3,"Kontener");
        kontener.set(4,3);

        System.out.println("Wyświetlenie zawartości kontenera dla resize, rozmiar: "+ kontener.size());
        for (int i = 0; i < kontener.size(); i++) {
            System.out.printf("Element [%d], wartość: %s \n",i,kontener.get(i));
        }
        System.out.println("Test metody toString(): "+ kontener);

        //Dane testowe dla metody equals
        Kontener03 kopia=new Kontener03(5);
        kopia.set(0,"Test");
        kopia.set(1,"Dla");
        kopia.set(2,40.5);
        kopia.set(3,"Kontener");
        kopia.set(4,3);
        System.out.println("Test metody equals(): "+ kontener.equals(kopia));

        Kontener03 kopiaFalse=new Kontener03(5);
        kopiaFalse.set(0,"Test");
        kopiaFalse.set(1,20.5);
        kopiaFalse.set(2,40);
        kopiaFalse.set(3,true);
        kopiaFalse.set(4,true);
        System.out.println("Test metody equals() dla różnych danych: "+ kontener.equals(kopiaFalse));

        //Do działania petli for-each potrzebny jest interfejs Iterable, zatem najlepszym testem jest wykorzystanie for-each to przetestowania
        System.out.println("Test pętli for-each");
        for(Object obj:kontener)
            System.out.println(obj);
        //Reczne wywołanie iteratora i użycie pętli while z wykorzystaniem zaimplementowanych metod hasNext() oraz next()
        System.out.println("Test ręcznego wywołania iteratora");
        Iterator<Object> iterator=kontener.iterator();
        while(iterator.hasNext()){
            Object obj=iterator.next();
            System.out.println(obj);
        }
    }
}
