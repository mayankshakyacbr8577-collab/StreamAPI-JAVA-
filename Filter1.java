import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Filter1 {
    public static void main(String[]args){
        List<Integer> numbers= Arrays.asList(10,60,45,90,30,24,50,50,76);
        ArrayList<Integer> m = new ArrayList<Integer>();
        m.addAll(numbers);
        System.out.println(m);
        Stream<Integer> markstream = numbers.stream();
        System.out.println("This is your Answer :");
        List<Integer>newsmark=markstream.filter(n->n>=40 && n<=60).toList();
        System.out.println(newsmark);
    }
}
