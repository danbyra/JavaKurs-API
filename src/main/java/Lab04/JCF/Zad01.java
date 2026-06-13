package Lab04.JCF;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zad01 {
    public static void main(String[] args) throws IOException {
        String nazwaPliku="ListaPiosenek.txt";
        List<String> tytuly=new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(nazwaPliku))) {
            tytuly=stream
                    .filter(blank->!blank.trim().isEmpty())
                    .map(linia->linia.split("/")[0].trim())
                    .collect(Collectors.toCollection(ArrayList::new));

        }
        catch (IOException e) {
            System.out.println("Błąd: odczyt pliku "+ e.getMessage());
        }
        System.out.println("Piosenki według kolejności  pliku: ");
        tytuly.forEach(System.out::println);
        System.out.println();
        Collections.sort(tytuly);
        System.out.println("Piosenki posortowane: ");
        tytuly.forEach(System.out::println);
    }
}
