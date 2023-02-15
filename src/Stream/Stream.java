package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i=0; i < 10; i++){
            list.add(r.nextInt(30));
        }


        list.stream()
                .filter(i -> i > 10)
                .sorted()
                .forEach(i -> System.out.println(i + " "));
    }
}