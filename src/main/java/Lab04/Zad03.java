package Lab04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zad03 {
    public static void main(String[] args) {
        String nazwaPliku="ListaPiosenek.txt";
        List<Piosenka> tytuly=new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(nazwaPliku))) {
            tytuly=stream
                    .filter(blank->!blank.trim().isEmpty())
                    .map(linia->{
                        String[] split = linia.split("/");
                        String tytul=split[0];
                        String artysta=split[1];
                        double ocena=Double.parseDouble(split[2]);
                        int bmp=Integer.parseInt(split[3]);
                        return new Piosenka(tytul, artysta, ocena, bmp);})
                    .collect(Collectors.toCollection(ArrayList::new));

        }
        catch (IOException e) {
            System.out.println("Błąd: odczyt pliku "+ e.getMessage());
        }
        System.out.println("Piosenki według kolejności  pliku: ");
        tytuly.forEach(System.out::println);

        System.out.println();
        Collections.sort(tytuly,new Piosenka.TytulComparator());
        System.out.println("Piosenki posortowane według tytułów: ");
        tytuly.forEach(System.out::println);

        System.out.println();
        Collections.sort(tytuly,new Piosenka.ArtystComparator());
        System.out.println("Piosenki posortowane według artysty");
        tytuly.forEach(System.out::println);
    }
}
