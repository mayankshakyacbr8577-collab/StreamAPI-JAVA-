package Practice_Question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapUpperCase {
    public static void main(String[] args){
        List<String> upper1= Arrays.asList("mayank","shakya","sachin","kumar");
        Stream<String> upper2= upper1.stream();
        List<String> upper3=upper2.map(n-> n.toUpperCase()).toList();
        System.out.println(upper3);
    }
}
