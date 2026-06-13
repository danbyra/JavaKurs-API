package Lab04.IntefejsFunkcyjnyOrazPrzykladKiedyNieMoznaGoUzyc;

import Lab04.UtworzKolekcjeZadanie.TestyKolekcji;

import java.util.function.IntSupplier;

public class Main {
    public static void main(String[] args) {
        //PRZYKŁAD UŻYCIA INTERFEJSU FUNKCYJNEGO
        double bill=2000.00;
        //nadałem obniżce 35% bo jestem hojny
        DiscountInterface discount=d->d*0.65;
        double billAfterDiscount=discount.discountAply(bill);

        System.out.println("Rachunek początkowy: "+ bill);
        System.out.println("Rachunek po obniżce (Wykorzystanie IF): "+ billAfterDiscount);

        //PRZYKŁAD KIEDY NIE MOŻNA TEGO ZROBIĆ
        //W tym celu wykorzystam klase anonimową IntSupplier, która ma pamiętać jakiś stan rzeczy
        //Dla tego przypadku kod się wykona

        IntSupplier supp=new IntSupplier() {
            private int value=0;
            @Override
            public int getAsInt() {
                value+=2;
                return value;
            }
        };
        System.out.println("Wywołania klasy anonimowej");
        System.out.println(supp.getAsInt());
        System.out.println(supp.getAsInt());
        System.out.println(supp.getAsInt());
        System.out.println(supp.getAsInt());
        System.out.println(supp.getAsInt());

        // Dla tego przypadku kod nie zostanie wykonany z uwagi na błąd kompilacji o treści:
        //java: local variables referenced from a lambda expression must be final or effectively final

//        int value=0;
//        IntSupplier suppLaambda=()->{
//            value+=2;
//            return value;
//        };
//
//        System.out.println(suppLaambda.getAsInt());
//        System.out.println(suppLaambda.getAsInt());
//        System.out.println(suppLaambda.getAsInt());
//        System.out.println(suppLaambda.getAsInt());
//        System.out.println(suppLaambda.getAsInt());
    }
}
