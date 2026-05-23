package Lab01;

public class ZF6 {
    public static void main(String[] args)
    {
        int a=10;
        int b=10;
        System.out.println("a= "+a);
        System.out.println("b= "+b);

        System.out.println("a==b "+(a==b));
        
        //dla typu Integer następuja zjawisko Integer Cashe, czyli dla wartości powyżej 127
        // jest tworzony nowy obszar w pamięci na stercie a na stosie jest przechowywana referemcja do
        //tego obszaru pamieci --> powyżej tej wartosć zamiast == używa się equals
        //dla zakresu -128 do 127 stos wskazuje na tą samą sterte -> działa operator ==
        Integer aVar=1000;
        Integer bVar=1000;
        System.out.println("A= "+aVar);
        System.out.println("B= "+bVar);
        System.out.println("A==B "+(aVar.equals(bVar)));
        /*Sytuacja dla stringa*/
        String s1="Cat";
        String s2="Cat";
        System.out.println("s1= "+s1);
        System.out.println("s2= "+s2);
        System.out.println("s1==s2 "+(s1==s2));
        //stworzenie stringa przez new
        //Sytuacja podobna jak dla Integer, mehcanizm cashowania przez przypisanie wskazuje
        //na to samo miejsce na stercie
        // Poprzez stworzenie stringa przez operator new, alokowane jest nowe miejsce na stercie
        // oraz adres jest przechowany na stosie --> operator == nie działa, bo wskazuje na dwa
        // rózne miejsca na stercie pamięci
        String s3= new String("Cat");
        System.out.println("Sprawdzenie dla stinga utworzonego za pomocą new");
        System.out.println("s3= "+s3);
        System.out.println("s1==s3 poprzez operator ==: "+(s1==s3)); //false
        System.out.println("s1==s3 przez equals: "+(s1.equals(s3)));
    }
}
