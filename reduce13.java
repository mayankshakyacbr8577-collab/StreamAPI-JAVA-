import java.util.Arrays;
import java.util.List;

public class reduce13 {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(5);
        int n=5;
        int result=list.stream().reduce(1,(a,b)->a*b);
        System.out.println(result);
    }
}
