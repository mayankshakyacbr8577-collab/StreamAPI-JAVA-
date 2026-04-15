import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class StreamEx {
    public static void main(String[]args){
        List data = Arrays.asList(10,15,20,25,30,11,17,16);
        ArrayList<Integer> list=new ArrayList<Integer>();
//        list.add(73);
//        list.addAll(List.of(34,65,78));
        list.addAll(data);
        System.out.println(list);
        list.stream().filter((n)->n%2==0).forEach(System.out::println);
    }
}
