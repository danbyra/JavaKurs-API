package Lab03;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Zadanie06 {
    public static void limitAndSort(){
        List<String> names= Arrays.asList("Przemysław","Dorota","Mateusz","Karol","Anna","Maksymilian");
//            names.stream()
//                    .map(String::length)
//                    .forEach(System.out::println);
//
//        List<String>collect=names.stream()
//                .filter(s->s.length()>2)
//                .limit(5)
//                .map(String::toUpperCase)
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println(collect);
//        List<String>collect=names.stream()
//                .filter(s->s.length()>2)
//                .limit(5)
//                .map(String::toUpperCase)
//                .sorted((o1,o2)->o1.length()-o2.length()) //sortowanie od najkrótszego do najdłuższego
//                .collect(Collectors.toList());
//
//        System.out.println(collect);

        List<String>collect= Collections.singletonList(names.stream()
                .filter(s -> s.length() > 2)
                .limit(5)
                .map(String::toUpperCase)
                .sorted((o1, o2) -> o1.length() - o2.length()) //sortowanie od najkrótszego do najdłuższego
                .collect(Collectors.joining(","))); //wrzuca to jako jeden obiekt String

        System.out.println(collect);
    }
    public static void statistics(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        OptionalInt optionalInt=numbers.stream()
//                .mapToInt(x->x)
//                .min();
//        System.out.println(optionalInt.getAsInt());
        IntSummaryStatistics intSummaryStatistics=numbers.stream()
                .mapToInt(x->x)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);
    }
    public static void main(String[] args) {

        //limitAndSort();
        statistics();
    }
}
