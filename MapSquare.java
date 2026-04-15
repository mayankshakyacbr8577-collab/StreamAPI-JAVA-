package Practice_Question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapSquare {
    public static void main(String[] args){
        List<Integer> square1= Arrays.asList(2,5,4,7,58);
        Stream<Integer> square2=square1.stream();
        List<Integer> square3=square2.map(n-> n*n).toList();
        System.out.println(square3);
    }
}
