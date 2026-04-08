import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map09 {
    public static void main(String[] args){
        List<String>change3= Arrays.asList("1","2","3");
        ArrayList<String>list = new ArrayList<String>();
        list.addAll(change3);
        System.out.println(list);
        List<Integer>change4=list.stream().map(Integer::parseInt).toList();
        System.out.println(change4);
    }
}
