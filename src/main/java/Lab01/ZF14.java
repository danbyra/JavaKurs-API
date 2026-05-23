package Lab01;

import java.util.Scanner;

public class ZF14 {
    public static void tabliceDwuwymiarowe()
    {
        int[]numbers={10,11,12,13,14,15};
        int[][]numbersMatrix=
                {
                        {10,11,12},
                        {13,14},
                        {15,16,17},
                        {18}
                };

        System.out.println("Podaj ilośc poziomów: ");
        Scanner sc=new Scanner(System.in);
        int iloscWymiarow=sc.nextInt();
        for (int i = 0; i < iloscWymiarow; i++)
        {
            for (int j = 0; j <=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //wyświetlanie tablicy dwuwymiarowej --> zapis foreach

//        for(int [] numbersRows:numbersMatrix)
//        {
//            for (int number:numbersRows)
//            {
//                System.out.print(number+ " ");
//            }
//            System.out.println();
//        }
//        int sumGlobal=0;
//
//        //wyświetlanie tablucy dwuwymiarowej --> zapis pętla for
//        for (int i = 0; i < numbersMatrix.length; i++)
//        {
//            int sum=0;
//            for (int j = 0; j < numbersMatrix[i].length; j++)
//                {
//                    //if(numbersMatrix[i][j]==13)break;;//ominiemy cały jeden wierssz
//                    //if(numbersMatrix[i][j]==13)continue;//ominięcie wartośći 13
//                    //System.out.print(numbersMatrix[i][j]+" ");
//                    sum+=numbersMatrix[i][j];
//                }
//            sumGlobal+=sum;
//            //System.out.println();
//        }
//        System.out.println(sumGlobal);


//        //test continue
//        for (int i=0;i<numbers.length;i++)
//        {
//            if(numbers[i]==10 || numbers[i]==11)
//            {
//                continue;
//            }
//            System.out.println(numbers[i]);
//        }
//        System.out.println("*****");
//        //test break
//        for (int i = 0; i <numbers.length ; i++)
//        {
//            if(numbers[i]==12)break;
//            System.out.println(numbers[i]);
//        }
//
//        System.out.println("Podaj dowolne słowo: ");
//        Scanner sc=new Scanner(System.in);
//        String word=sc.next();
//        for(char wordPart:word.toCharArray())
//        {
//            System.out.print(wordPart+ " ");
//        }
    }
}
