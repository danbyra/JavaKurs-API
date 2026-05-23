package Lab01;
import static java.lang.Math.*;
public class Zad6
{
    public static void main(String args[]){
        //wyjaśnienie formatki
        //%->początek
        //15 -> minimalna szerokośc kolumny
        //.10 -> ilośc miejsc po przecinku, czyli precyzja
        //f -> oznaczenie liczby jako zmienna przecinkowa

        System.out.printf("Liczba e = %15.10f\n",E);
        System.out.printf("Liczba pi = %15.10f\n",PI);
        System.out.printf("Liczba fi = %15.10f\n",(1+sqrt(5))/2); }
}
