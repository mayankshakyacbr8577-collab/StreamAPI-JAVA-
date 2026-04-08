import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Map06 {
    public static void main(String[] args){
        List<String>change1= Arrays.asList("Java","Stream","API");
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(change1);
        System.out.println(list);
        List<Integer>change2=list.stream().map(x->x.length()).
                toList();
        System.out.println(change2);
    }
}
