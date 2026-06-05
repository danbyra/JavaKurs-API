package Lab03;

import java.util.Arrays;
import java.util.List;

public class Zadanie04 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Przemek","Dorota","Łukasz","Karol","Anna","Marcysia");
        int counter= Math.toIntExact(names.stream()
                .filter(name -> name.length() > 6)
                .count());
        System.out.println(counter);
    }
}
