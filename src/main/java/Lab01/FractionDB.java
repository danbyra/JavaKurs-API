package Lab01;

import java.util.Objects;

public class FractionDB {
    private int numerator;
    private int denominator;

    public FractionDB() {
        this(0, 1);
    }

    public FractionDB(int licznik) {
        this(licznik, 1);
    }

    public FractionDB(int licznik, int mianownik) {
        if (mianownik == 0) throw new IllegalArgumentException("BŁĄD: mianownik równy zero");
        this.numerator = licznik;
        this.denominator = mianownik;
        correction();
        reduce();
    }

    public FractionDB(FractionDB fraction) {
        this.numerator = fraction.numerator;
        this.denominator = fraction.denominator;
        //Dopytać się czy ma sens w konstruktorze kopiującym wywołanie ponownie tych metod
//       correction();
//       reduce();
    }
    public FractionDB(String str)
    {
        str=str.trim();
       try
       {
           if(str.contains(","))
           {
               str=str.replace(",",".");
           }
           if(str.contains("/"))
           {
               int indexSlash=str.indexOf("/");
               String licznik=str.substring(0,indexSlash);
               String mianownik=str.substring(indexSlash+1);
               this.numerator=Integer.parseInt(licznik);
               this.denominator=Integer.parseInt(mianownik);
           }
           else if (str.contains("."))
           {
               int indexDot=str.indexOf(".");
               String przedKropka=str.substring(0,indexDot);
               String poKropce=str.substring(indexDot+1);
               int czescDziesietna=poKropce.length();
               this.numerator=Integer.parseInt(przedKropka + poKropce);
               this.denominator=(int)Math.pow(10, czescDziesietna);
           }
           else
           {
               this.numerator=Integer.parseInt(str);
               this.denominator=1;
           }

           this.correction();
           this.reduce();
       }
       catch (NumberFormatException | StringIndexOutOfBoundsException e)
       {
           throw new IllegalArgumentException("BŁĄD: Podany łańcuch znaków nie przedstawia ułamka");
       }
    }
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNum(int licznik) {
        this.numerator = licznik;
    }

    public void setDen(int mianownik) {
        if (mianownik <= 0) throw new IllegalArgumentException("BŁĄD: Mianownik mniejszy bądź równy zero");
        this.denominator = mianownik;
    }

    public void setFrac(int licznik, int mianownik) {
        this.setNum(licznik);
        this.setDen(mianownik);
    }
    private void correction() {
        if (denominator < 0) {
            this.numerator = (-1) * this.numerator;
            this.denominator = (-1) * this.denominator;
        }
    }
    public void reduce() {
        int dzielnik = nwd(this.numerator, this.denominator);
        this.numerator /= dzielnik;
        this.denominator /= dzielnik;
    }
    public void reduce(int dzielnik) {
        if (dzielnik <= 0) throw new IllegalArgumentException("BŁĄD: Dzielnik musi być liczbą dodatnią");
        if (this.numerator % dzielnik != 0 && this.denominator % dzielnik != 0)
            throw new ArithmeticException("BŁĄD: Nie da sie zredukować ułamka bez reszty");
        this.numerator /= dzielnik;
        this.denominator /= dzielnik;
    }
    public void equivalent(int mnoznik) {
        if (mnoznik == 0) throw new IllegalArgumentException("BŁĄD: Nie można rozszerzyć ulamka przez 0");
        this.numerator *= mnoznik;
        this.denominator *= mnoznik;
    }
    private int nwd(int a, int b) //Wykorzystanie algorytmu Euklidesa
    {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public FractionDB multiplication(FractionDB fraction2) {
        int licznik = this.getNumerator() * fraction2.getNumerator();
        int mianownik = this.getDenominator() * fraction2.getDenominator();
        reduce();
        return new FractionDB(licznik, mianownik);
    }

    public FractionDB multiplication(int liczba) {
        int licznik = this.getNumerator() * liczba;
        reduce();
        return new FractionDB(licznik, this.denominator);
    }

    public static FractionDB product(FractionDB f1, FractionDB f2) {
        return f1.multiplication(f2);
    }
    public static FractionDB product(FractionDB f1, int liczba)
    {
        return f1.multiplication(liczba);
    }
    public static FractionDB product(int liczba, FractionDB f1)
    {
        return f1.multiplication(liczba);
    }
    public static FractionDB product(int l1,int l2)
    {
        FractionDB f1 = new FractionDB(l1);
        FractionDB f2 = new FractionDB(l2);
        return f1.multiplication(f2);
    }
    public double doubleValue()
    {
        return (double)this.getNumerator() / (double)this.getDenominator();
    }
    public static double toDouble(FractionDB f1)
    {
        return f1.doubleValue();
    }
    public float floatValue()
    {
        return (float)this.getNumerator() / (float)this.getDenominator();
    }
    public  static float toFloat(FractionDB f1)
    {
        return f1.floatValue();
    }
    public static FractionDB valueOf(int liczba)
    {
        return new FractionDB(liczba);
    }
    public static FractionDB valueOf(String s)
    {
        return new FractionDB(s);
    }
    public static FractionDB valueOf(double dbl)
    {
        return new FractionDB(""+dbl);
    }
    public static FractionDB valueOf(float flt)
    {
        return new FractionDB(""+flt);
    }
    public static FractionDB valueOf(int licznik, int mianownik)
    {
        return new FractionDB(licznik, mianownik);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj==null || getClass() != obj.getClass())return false;
        FractionDB fractionDB = (FractionDB) obj;
        return this.numerator==fractionDB.numerator && this.denominator==fractionDB.denominator;
    }
    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}
