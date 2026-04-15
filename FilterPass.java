package Practice_Question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterPass {
    public static void main(String[] args){
        List<Integer> num1= Arrays.asList(10,60,90,30,24,50,70,55);
        Stream<Integer> num2 = num1.stream();
        List<Integer> num3=num2.filter(n-> n>=40).sorted().toList();
        System.out.println(num3);
    }
}
