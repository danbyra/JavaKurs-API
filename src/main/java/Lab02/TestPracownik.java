package Lab02;
public class TestPracownik {
    public static void main(String[] args) {

        System.out.println("--- TEST ZADANIA 1 - 5 (Tablica Pracownikow) ---");
        Pracownik[] pracownicy = new Pracownik[6];

        pracownicy[0] = new Pracownik();
        pracownicy[1] = new Pracownik(4500.0);
        pracownicy[2] = new Pracownik("Kowalski", 6000.0);

        pracownicy[3] = new Menadzer();
        pracownicy[4] = new Menadzer(3500.0);
        pracownicy[5] = new Menadzer("Nowak", 9000.0, 5000.0);


        for (Pracownik p : pracownicy) {
            p.podniesPensje(5); // [cite: 8]
        }

        for (Pracownik p : pracownicy) {
            System.out.println(p.toString() + " -> " + p.getNazwisko() + ", ID: " + p.getId() +
                    ", Pensja calkowita: " + p.getPensja());
        }

        System.out.println("\n--- TEST ZADANIA 6 (Tablica Osoby - Polimorfizm) ---");

        Osoba[] osoby = new Osoba[9];

        osoby[0] = new Pracownik();
        osoby[1] = new Pracownik(3500.0);
        osoby[2] = new Pracownik("Wisniewski", 5000.0);

        osoby[3] = new Student();
        osoby[4] = new Student("Informatyka");
        osoby[5] = new Student("Malinowski", "Automatyka");

        osoby[6] = new Menadzer();
        osoby[7] = new Menadzer(4000.0);
        osoby[8] = new Menadzer("Abacki", 12000.0, 6000.0);


        for (Osoba o : osoby) {
            System.out.print("Klasa: " + o.getClass().getSimpleName() + " | Nazwisko: " + o.getNazwisko());
            System.out.print(" | Opis: " + o.getOpis()); //

            if (o instanceof Pracownik) {
                System.out.print(" | ID: " + ((Pracownik) o).getId());
            }
            if (o instanceof Menadzer) {
                System.out.print(" | Bonus: " + ((Menadzer) o).getBonus());
            }
            if (o instanceof Student) {
                System.out.print(" | Kierunek: " + ((Student) o).getKierunek());
            }
            System.out.println();
        }
    }
}

abstract class Osoba {
    //najbardziej ogólne z całej hierarchii jest nazwisko

    private final String nazwisko;

    public Osoba()
    {
        this.nazwisko = "Domyślne";
    }
    public Osoba(String nazwisko)
    {
        this.nazwisko=nazwisko;
    }
    public String getNazwisko()
    {
        return nazwisko;
    }
    public abstract String getOpis();
}
class Pracownik extends Osoba {
    private static int nastepnyId = 1;
    private int id;
    private double pensja;

    public static int przyznajId()
    {
        return nastepnyId++;
    }

    {
        this.id = przyznajId();
    }

    Pracownik()
    {
        super();
        this.pensja = 0;
    }
    Pracownik(double pensyja)
    {
        this("Domyślne", pensyja);
    }
    Pracownik(String nazwisko, double pensja)
    {
        super(nazwisko);
        this.pensja = pensja;
    }
    public int getId()
    {
        return id;
    }
//    public String getNazwisko()
//    {
//        //return nazwisko;
//    }
    public double getPensja()
    {
        return pensja;
    }
//    public Pracownik setNazwisko(String nazwisko)
//    {
//        this.nazwisko=nazwisko;
//    }
    public void setPensja(double pensja)
    {
        this.pensja = pensja;
    }
    public void podniesPensje(double procent)
    {
        this.pensja += this.pensja * (procent/100);
    }

    @Override
    public String toString()
    {
        return this.getClass().getName();
    }

    @Override
    public String getOpis() {
        return "Pensja dla pracownika: "+ getPensja();
    }
}
class Menadzer extends Pracownik {
    private double bonus;
    public Menadzer()
    {
        super();
        this.bonus = 0;
    }
    public  Menadzer(double bonus) //Wydaje mi się, że tak jest najbardziej analogicznie w porównaniu z klasą Pracownik
    {
        super("Domyślne",0);
        this.bonus = bonus;
    }
    public Menadzer(String nazwisko,double pensja,double bonus)
    {
        super(nazwisko,pensja);
        this.bonus = bonus;

    }
    public void zmienBonus(double bonus)
    {
        this.bonus = bonus;
    }
    public double getBonus()
    {
        return bonus;
    }

    @Override
    public double getPensja() {
        return super.getPensja()+bonus;
    }

    @Override
    public String getOpis() {
        return"Pensja dla menadżera: "+ getPensja();
    }
}
class Student extends Osoba {
    private String kierunek;
    public Student()
    {
        super();
        this.kierunek = "nieokreślony";
    }
    public Student(String kierunek)
    {
        super();
        this.kierunek = kierunek;
    }
    public Student(String nazwisko,String kierunek)
    {
        super(nazwisko);
        this.kierunek = kierunek;
    }
    public String getKierunek()
    {
        return kierunek;
    }
    @Override
    public String getOpis() {
        return "Student na kierunki: "+ getKierunek();
    }
}
