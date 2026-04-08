import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map05 {
    public static void main(String[]args){
        List<String>prefix= Arrays.asList("A","B","C");
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(prefix);
        System.out.println(list);
        List<String> prefix2=list.stream()
                .map(n->"Item-"+n)
                .toList();
        System.out.println(prefix2);

    }
}
