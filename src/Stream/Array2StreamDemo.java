// StreamFilter_516p
package Stream;

import java.util.List;
import java.util.stream.Stream;

public class Array2StreamDemo {
    public static void main(String[] args) {
        List<String> name = List.of("홍길동", "배정화", "임꺽정", "연흥부", "김선달", "황진이");
        Stream<String> s1 = name.stream();
        s1.filter(n -> n.charAt(0) < '이').forEach(n -> System.out.print(n + " "));
        System.out.println();
        Stream<String> s2 = name.stream();
        s2.sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();
        Stream<String> s3 = name.stream();
        System.out.println(s3.findFirst());
        Stream<String> s4 = name.stream();
        System.out.println(s4.findFirst().get());
        Stream<String> s5 = name.stream();
        System.out.println(s5.count());

    }
}