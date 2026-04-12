import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Sort03 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(18,42,7,91,33,25,60);
        System.out.println(list);
        List<Integer> thirdMax=list.stream().sorted((a,b)->b-a)
                .limit(3)
                .toList();
        System.out.println(thirdMax);
    }
}
