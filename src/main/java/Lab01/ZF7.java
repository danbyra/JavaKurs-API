package Lab01;

public class ZF7
{
    //operatory dwuargumentowe
    public static void main(String[] args)
    {
        //operatory dwuargumentowe
        int i1=10;
        int i2=20;
        int i3=3;
        int i4=4;
        System.out.println("i1 + i2= " + (i1+i2));
        System.out.println("i1 - i2= " + (i1-i2));
        System.out.println("i3 * i4= " + (i3*i4));
        System.out.println("i2 / i1= " + (i2/i1));
        System.out.println("i4 % i3= " + (i4%i3));
        System.out.println("***********************************");

        //operatory jednoarfumetnowe
        int i5=10;
        int i6=-10;
        System.out.println("i5: "+ i5);
        //preinkrement
        System.out.println("++i5 = "+ ++i5);
        System.out.println("i5: "+ i5);
        //postinkremnt
        System.out.println("i5++ = "+ i5++);
        System.out.println("i5: " + i5);

        System.out.println("i6: "+ i6);
        //preinkrement
        System.out.println("--i6 = "+ --i6);
        System.out.println("i6: "+ i6);
        //postinkremnt
        System.out.println("i6-- = "+ i6--);
        System.out.println("i6: " + i6);

        //operatory przypisania (=,+=,-=,*-,/=,%=)
         int i7=10;
         int i8=10;
         i7+=5;
         i8-=5;
         System.out.println("i7+=5 =  "+ i7);
         System.out.println("i8-=5 =  "+ i8);
        //operatory relacyjne

        int i9=10;
        int i10=20;
        System.out.println("i9==i10 =  "+ (i9==i10));
        System.out.println("i9!=i10 =  "+ (i9!=i10));
        System.out.println("i10>i9 =  "+ (i10>i9));
        System.out.println("i10>=i9 =  "+ (i10>=i9));
        System.out.println("i10<i9 =  "+ (i10<i9));
        System.out.println("i10<=i9 =  "+ (i10<=i9));
    }
}
