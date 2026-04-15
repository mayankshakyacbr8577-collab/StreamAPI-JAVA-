//13.	Write a Java program using Stream API distinct() and filter() to print unique numbers greater than 15 from the list:
//        [10, 20, 20, 30, 30].

        package Practice_Question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Print_unique_numbers {
    public static void main(String[] args){
        List<Integer> uni1= Arrays.asList(10, 20, 20, 30, 30);
        uni1.stream()
                .distinct()
                .filter(n->n>15).forEach(System.out::println);

    }
}
