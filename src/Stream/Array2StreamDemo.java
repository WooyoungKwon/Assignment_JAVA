// Stream_517p_Second
package Stream;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Array2StreamDemo {
    public static void main(String[] args) {
        enum Gender { 남,여 }
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);

        Stream<Integer> as = ages.stream();
        System.out.println(as.reduce(Integer::sum).get());
        Stream<Integer> ax = ages.stream();
        System.out.println(ax.max(Integer::compare).get());
        IntStream is = ages.stream().mapToInt(a -> a.intValue());
        System.out.println(is.average().getAsDouble());

    }
}