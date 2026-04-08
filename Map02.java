import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map02 {
    public static void main(String[] args){
        List<Integer> number = Arrays.asList(1,2,3,4);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(number);
        System.out.println(list);
        List<Integer> square = list.stream().map(n->n*n).toList();
        System.out.println(square);
    }
}
