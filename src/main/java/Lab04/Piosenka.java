package Lab04;

import java.util.Comparator;
import java.util.Objects;

class Piosenka implements Comparable<Lab04.Piosenka>{
    private String tytul;
    private String artysta;
    private double ocena;
    private int bmp;

    public Piosenka(String tytul, String artysta, double ocena, int bmp){
        this.tytul = tytul;
        this.artysta = artysta;
        this.ocena = ocena;
        this.bmp = bmp;
    }
    String getTytul() {return tytul;}
    String getArtysta() {return artysta;}
    double getOcena() {return ocena;}
    int getBmp() {return bmp;}

    @Override
    public String toString() {
        return String.format("TYTUŁ: %s ARTYSTA: %s OCENA: %.2f BMP: %d", tytul, artysta, ocena, bmp);
    }
    /*KOD Z ZADANIA 2*/
    @Override
    public int compareTo(Lab04.Piosenka o) {
        return this.tytul.compareTo(o.tytul);
    }
    /*KOD Z ZADANIA 3*/
    public static class TytulComparator implements Comparator<Piosenka> {
        @Override
        public int compare(Piosenka o1, Piosenka o2) {
            return o1.getTytul().compareTo(o2.getTytul());
        }
    }
    public static class ArtystComparator implements Comparator<Piosenka> {
        @Override
        public int compare(Piosenka o1, Piosenka o2) {
            return o1.getArtysta().compareTo(o2.getArtysta());
        }
    }
    /*KOD Z ZADANIA 4*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piosenka that = (Piosenka) o;
        //equalsIgnoreCase pozwala na ignorowanie wielkości znaków, co w przypadku tytułow i artystów jest kluczowe
        return tytul.equalsIgnoreCase(that.tytul) && artysta.equalsIgnoreCase(that.artysta);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tytul, artysta);
    }
}