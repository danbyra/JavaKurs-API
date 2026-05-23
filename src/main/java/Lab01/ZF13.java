package Lab01;

public class ZF13
{
    public static void petleForForEach()
    {
        int[]numbers={10,11,12,13,14,15};
        int numbersLenght=numbers.length;
        for(int index=0;index<numbersLenght;index++)
        {
            System.out.println("Zawartość tablicy o indeksie "+index+" : "+(numbers[index]));
        }

        //tescik dla wielu zmiennych warunkowych oraz ich in/dekremenacji
        for(int index=0, index1=10;index<numbersLenght;index++,index1--)
        {
            System.out.println("index: "+index);
            System.out.println("index1: "+index1);
        }
        //petla foreach
        System.out.println("Zapis w formie pętli foreach");
        for(int number:numbers)
        {
            System.out.println("number: "+number);
        }
//        //tescik kiedy pętla będzie chciała wyjśc poza zakres rozmiaru tablicy
//        System.out.println("Test dla wyjątku out of range");
//        for(int index=0;index<7;index++) //wywali wyjątek, bo wychodzimy our of range dla tablicy numbers
//        {
//            System.out.println((numbers[index]));
//        }
//
//        for(int index=0;index<=numbersLenght;index++)//Analogicznie jak wyżej kod wyżej,bo przyzna index jako 6, a takiego nie mamy w tabicy
//        {
//            System.out.println((numbers[index]));
//        }

    }
}
