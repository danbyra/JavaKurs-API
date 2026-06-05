package Lab03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Zadanie03 {
    public static void ConsumerFull(){
        List<String>names= Arrays.asList("Przemke","Dorota","Łukasz","Karol","Anna","Marcysia");
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });
    }
    public static void ConsumerShort(){
        List<String>names= Arrays.asList("Przemek","Dorota","Łukasz","Karol","Anna","Marcysia");
        names.forEach((String s)-> System.out.println(s));
    }
    public static void main(String[] args) {
        ConsumerFull();
        System.out.println("****************");
        ConsumerShort();
        System.out.println("****************");
        //istnieje jeszcze szybszy zapis zastępujący laambdę dla funkcyjnego, co sam Intelij podpowiada,
        // z użyciem zapisu ::
        List<String>names= Arrays.asList("Przemek","Dorota","Łukasz","Karol","Anna","Marcysia");
        names.forEach(System.out::println);
    }
}
