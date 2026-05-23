package Lab01;

public class Zf12
{
    public static void petleWhileDoWhile()
    {
        int[]numbers={10,11,12,13,14,15};
        int numbersLenght=numbers.length;
        int index=0;
        while (index<numbersLenght)
        {
            System.out.println(numbers[index]);
            index++;
        }
        //ważne, żeby zmienna indeksu po której iterujemy zaczynała się od wartość 0, a nie 6
        //bo inaczej program się sypnie na przykładz powodu out of range

        do //pętla wykona się conajmniej raz niezależnie od warunku
        {
            System.out.println(numbers[index]);
            index++;
        }
        while (index<numbersLenght);

        //dla tego kodu jest inny błąd mianowicie wspólny indeks, zatem program
        //wywali błąd bo pętla do while będzie chciała odczytać indeks 6, a takiego w tablicy nie ma
        // bo mamy wspólny licznik, który jest inkrementowany przez petla while
    }
}
