import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort07 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(55,12,88,3,99,21);
        System.out.println(list);
        List<Integer> secondHigh= Collections.singletonList(list.stream()
                .sorted((a, b) -> b - a).skip(1).findFirst()
                .get());
        System.out.println(secondHigh);
    }
}
