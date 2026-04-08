import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map3 {
    public static void main(String[] args){
        List<String> name = Arrays.asList("Java","Python","C");
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(name);
        System.out.println(list);
        List<Character> character=list.stream().map(n->n.charAt(0)).toList();
    }
}
