import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Filter5 {
    public static void main(String[]args){
        List<String> name= Arrays.asList("Java","Spring","Mayank","Shakya","Mohan");
       Stream<String> realstream=name.stream();
       List<String>imgreal=realstream.filter(n->n.startsWith("M")).toList();
       System.out.println(imgreal);
    }
}
