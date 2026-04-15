import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter15 {
    public static void main(String[]args){
        List<Integer> numbers= Arrays.asList(10,15,20,25,30,45,36,45);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(numbers);
        System.out.println(list);
        List<Integer> evenNum=list.stream().filter(n->n%2==0).filter(n->n>15).toList();
        System.out.println(evenNum);
    }
}
