//	Write a Java program using Stream API filter() to remove all null values from the list:
//        ["Java", null, "Spring", null, "React"].

package Practice_Question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RemoveNull {
    public static void main(String[] args){
        List<String> rem1= Arrays.asList("Java", null, "Spring", null, "React");
        System.out.println(rem1);
        Stream<String> rem2= rem1.stream();
        List<String>rem3=rem2.filter(n->n !=null).toList();
        System.out.println(rem3);

    }
}
