import java.util.Arrays;
import java.util.List;

public class reduce10 {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Java","Programimg","Stream","API","Function");
        int result = list.stream().reduce("",(a,b)->a+" "+b);
        System.out.println(result);
    }
}
