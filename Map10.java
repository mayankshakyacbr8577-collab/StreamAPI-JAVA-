import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map10 {
    public static void main(String[] args){
        List<String>trim1= Arrays.asList("Java","Python","C++");
        ArrayList<String>list= new ArrayList<String>();
        list.addAll(trim1);
        System.out.println(list);
        List<String>trime2=list.stream().map(n->n.trim()).toList();
        System.out.println(trime2);
    }
}
