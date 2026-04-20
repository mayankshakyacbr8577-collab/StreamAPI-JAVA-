 // Find the Maximum Element using the Max() Mehode
package MaxMinPack;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Maximum1 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(10,12,15,62,65,59,35,34,32);
        System.out.println(list);
        Stream<Integer> list1 = list.stream();
        Optional<Integer> list2= list1.max((a, b)-> a-b);
        list2.ifPresent(System.out::println);

    }
}
