import java.util.Arrays;
import java.util.List;

public class reduce05 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(11,22,33,44,55,66,77,88);
        int result=list.stream().reduce(0,(a,b)->b%2==0?a+b:a);
        System.out.println(result);
    }
}
