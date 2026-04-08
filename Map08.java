import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Map08 {
    public  static void main(String[] args){
        List<Integer> double1= Arrays.asList(5,10,15);
        ArrayList<Integer>list=new ArrayList<Integer>();
        list.addAll(double1);
        System.out.println(list);
        List<Integer>double2=list.stream()
                .map(n->n*2)
                .toList();
        System.out.println(double2);
    }
}
