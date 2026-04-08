import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map04 {
    public static void main(String[] args){
        List<Integer> digits = Arrays.asList(10,15,20);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(digits);
        System.out.println(list);
        List<String>change2=list.stream().map(n->n.toString()).toList();
        System.out.println(change2);

    }
}
