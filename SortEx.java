import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SortEx {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(132,45,67,23,86,34,78);
        System.out.println(list);
        List<Integer>sortedList=list.stream().sorted((a,b)-> b-a).toList();
        System.out.println(sortedList);
    }
}
