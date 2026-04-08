import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Map01 {
    public static void main(String[] args){
        List<String> name= Arrays.asList("sachin","rahul","amit");
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(name);
        System.out.println(list);
        List<String> uppercase =  list.stream().
                map(n->n.toUpperCase()).toList();
        System.out.println(uppercase);
    }
}
