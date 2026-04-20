 // Find the min element in the given Arrays { min(a,b)->a-b }

package MaxMinPack;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

 public class MinElement {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(10,20,30,25,14,26,56,53,43,61,52);
        System.out.println(list);
        Stream<Integer> list1= list.stream();
        Optional<Integer> list3=list1.min((a,b)-> a-b);
        list3.ifPresent(System.out::println);
    }
}
