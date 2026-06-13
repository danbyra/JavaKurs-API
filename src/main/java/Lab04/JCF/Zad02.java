package Lab04.JCF;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Zad02 {
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
        //Collections.sort(tytuly);
        System.out.println("Piosenki posortowane: ");
        tytuly.forEach(System.out::println);
    }
}
