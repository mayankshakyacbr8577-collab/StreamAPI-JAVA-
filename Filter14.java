import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter14 {
    public static void main(String[]args){
        List<Integer> numbers= Arrays.asList(10,60,45,90,30,24,50,50,76);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(numbers);
        System.out.println(list);
        list.stream().filter((n)->n<=50 && n>=60).forEach(System.out::println);
    }
}
