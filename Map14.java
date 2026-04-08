import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map14 {
    public static void main(String[] args){
        List<String>mynk= Arrays.asList("Java","API","Mayank");
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(mynk);
        System.out.println(list);
        List<String>mayank=list.stream().map(n->n+"-"+n.length()).toList();
        System.out.println(mayank);
    }
}
