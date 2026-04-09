import java.util.Arrays;
import java.util.List;

public class Reduce03 {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(10,20,30,40,50,60,70);
        int result=list.stream().reduce(0,(a,b)->a+1);
        System.out.println(result);
    }
}
