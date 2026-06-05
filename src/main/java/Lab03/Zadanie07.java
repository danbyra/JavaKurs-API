package Lab03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Zadanie07 {
    private static final List<String>LIST= Arrays.asList("aaa","bbb","ccc","ddd","eee","fff","ggg");
    private static final List<String>LIST1= Arrays.asList("aab", "aab","aac", "aac","bbb", "ccc", "ddd");

    public static void main(String[] args) {
        LIST.stream()
                .filter(s->s.startsWith("a"))
                .map(String::toUpperCase)
                .peek(System.out::println) //samo peek nie wyświetla zawartości, dopiero wrzucenie w kolekcje wyświetla
                .collect(Collectors.toList());

        System.out.println("---------------------------------------------");
        List<String>a=LIST1.stream()
                .filter(e->{
                    System.out.println("Stream - filter: "+e);
                    return e.startsWith("a");
                })
                .map(e->{
                    System.out.println("Stream - map: "+e);
                    return e.toUpperCase();
                })
                .collect(Collectors.toList());

        System.out.println("-----------Przetwarzanie rónwoległe----------------");
        LIST1.parallelStream()
                .filter(e->{
                    System.out.println("Stream - filter: "+e);
                    return e.startsWith("a");
                })
                .map(e->{
                    System.out.println("Stream - map: "+e);
                    return e.toUpperCase();
                })
                .collect(Collectors.toList());
    }
}
