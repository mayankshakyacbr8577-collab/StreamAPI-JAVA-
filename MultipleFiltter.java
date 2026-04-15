//15.	Write a Java program using multiple filter() operations to print numbers that are greater than 15 and even from the list:
//        [10, 15, 20, 25, 30, 35].

package NewPak;

import java.util.Arrays;
import java.util.List;

public class MultipleFiltter {
    public static void main(String[] args){
        List<Integer>multi= Arrays.asList(10, 15, 20, 25, 30, 35);
        multi.stream()
                .filter(n->n%2==0)
                .filter(n->n>15)
                .forEach(System.out::println);
    }
}
