package Lab01;

public class Zad2
{
    public static void main(String args[])
    {
        System.out.println("Zadania z programowania."); //Wyświetla napis
        System.out.println("Zadania z programowania.".charAt(0)); //Wyświetla pierwszy znak czyli Z
        System.out.println("Zadania z programowania.".length());// Wyświetla dlugość stringa(liczy spacje itp)
        System.out.println("Zadania z programowania.".charAt(23));// Wyswietla ostatni znak czyli kropka
        System.out.println("Zadania z programowania.".toUpperCase());// Cały napis wielkimi literami
        System.out.println("Zadania z programowania.".toLowerCase());// cały napis małymi literami
        System.out.println("Zadania z programowania.".indexOf('z')); //Szuka kiedy z pojawiło się poraz pierwszy
        System.out.println("Zadania z programowania.".indexOf("prog"));// Anallogicznie jak wyżej tylko szuka frazy prog
        System.out.println("Zadania z programowania.".replace('.','?'));//Zastępuje kropkę znakiem zapytania(raz)
        System.out.println("Zadania z programowania.".replace("adania","dania")); //Analogiczie jak wyżej
        System.out.println("Zadania z programowania.".replaceAll("ania","anka"));//Zastępuje wszędzie gdzie wystąpi
        System.out.println("Zadania z programowania.".replaceFirst("ania","anka"));//Zamiana tylko pierszego napotkanego
        System.out.println("Zadania z programowania.".substring(10));//Wycinka stringa od indeksu 10 do konca
        System.out.println("Zadania z programowania.".substring(10,17));//Wycina stringa od indeksu 10 do 17 włącznie
        System.out.println("Zadania z programowania.".concat("\b z podpowiedziami."));//Złączenie tekstu pierwotnego z frazą: z podpowiedziami (usuwa kropkę tam gdzie wczęsniej była)
        System.out.println("Zadania z programowania."+"\b"+" z odpowiedziami.");//działa tak samo jak wyżej tylko nie używa concat
    }
}

