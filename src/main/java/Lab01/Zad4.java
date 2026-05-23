package Lab01;

public class Zad4
{
    public static void main(String args[])
    {
        System.out.println("Wybrane stałe i metody statyczne klasy Integer\n");
        System.out.println("Integer.MIN_VALUE "+Integer.MIN_VALUE); //Wartośc minimalna dla typu integer
        System.out.println("Integer.MAX_VALUE "+Integer.MAX_VALUE); //Wartość maksymalna dla integer
        System.out.println("Integer.SIZE "+Integer.SIZE);//rozmiar integera w bitach
        int a=179; //przypisanie wartosc do zmiennej a typu integer
        System.out.println("a= "+a);//Wyświetlenie wartośći zmiennej a
        System.out.println("Integer.toBinaryString(a) "+Integer.toBinaryString(a)); //rzutowanie jawne na binarke
        System.out.println("Integer.toOctalString(a) "+Integer.toOctalString(a)); // rzutowanie jawne na ósemkowy
        System.out.println("Integer.toHexString(a) "+Integer.toHexString(a)); // rzutowanie jawne na szesnastkowy
        System.out.println("Integer.toString(a) "+Integer.toString(a));// w systemie dziesięnym
        System.out.println("Integer.toString(a,4) "+Integer.toString(a,4));// w systemie czwórkowym, albo dowolnym jaki wymyślimy
        int b=Integer.parseInt("-177");// Zamiana tekstu na liczbe int
        System.out.println("b= "+b);// Wyświetlenie
        int c=Integer.parseInt("1000",8);//układ pozycyjny o podstawie 8
        System.out.println("c= "+c);
        System.out.println("Integer.signum(a) "+Integer.signum(a));//znak liczby (dodatnia)
        System.out.println("Integer.signum(b) "+Integer.signum(b));// znak liczby (ujemna)
        System.out.println("Integer.signum(0) "+Integer.signum(0));//znak liczby (dla 0)
    }
}
