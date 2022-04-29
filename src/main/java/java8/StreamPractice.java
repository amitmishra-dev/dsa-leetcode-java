package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamPractice {

    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        ages.add(5);
        ages.add(10);
        ages.add(13);
        ages.add(23);
        ages.add(78);
        Predicate<Integer>  predicate = new Predicate<Integer>() {
            @Override public boolean test(Integer age) {
                if (age > 22 )
                    return true;
                else
                    return false;
            }
        };
        //predicate.test(ages.stream().);

    }
}
