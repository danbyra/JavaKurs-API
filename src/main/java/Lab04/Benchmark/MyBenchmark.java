package Lab04.Benchmark;

import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Benchmark;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static Lab04.Benchmark.DataProvider.PREFIX;

public class MyBenchmark {

    @Benchmark
    @Fork(value = 1, warmups = 2)
    public void forLoop() {
        List<String> convertedList = new ArrayList<>();
        for (String word : DataProvider.WORDS) {
            if (word.startsWith(PREFIX)) {
                convertedList.add(word.toUpperCase());
            }
        }
    }

    @Benchmark
    @Fork(value = 1, warmups = 2)
    public void stream() {
        List<String> convertedList = DataProvider.WORDS.stream()
                .filter(word -> word.startsWith(PREFIX))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    @Benchmark
    @Fork(value = 1, warmups = 2)
    public void parallelStream() {
        List<String> convertedList = DataProvider.WORDS.parallelStream()
                .filter(word -> word.startsWith(PREFIX))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
