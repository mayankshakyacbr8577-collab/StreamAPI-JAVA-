import java.util.Arrays;
import java.util.List;

public class ReduceEx {
    public static void main(String[]args){
        List<Integer> list = Arrays.asList(8,14,5,6,1,17,9);
        int  result= list.stream().reduce(1,(a,b)->a*b);
        System.out.println(result);
    }
}
