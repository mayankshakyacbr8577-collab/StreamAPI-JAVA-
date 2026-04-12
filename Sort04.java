import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Sort04 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(14,9,20,7,6,11,32,3);
        System.out.println(list);
        List<Integer> evenNumber = list.stream().sorted((a,b)->a%2==0?b-a: a).toList();
        System.out.println(evenNumber);
    }
}
