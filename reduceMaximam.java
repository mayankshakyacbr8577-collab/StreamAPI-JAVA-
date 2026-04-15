//Write a Java program to find the maximum element using reduce().
//ArrayList values:
//        [12, 45, 7, 89, 23, 56]

package NewPak;

import java.util.Arrays;
import java.util.List;
public class reduceMaximam {
    public static void main(String[] args){
        List<Integer> max1= Arrays.asList(12, 45, 7, 89, 23, 56);
      int max =  max1.stream().reduce((a,b)-> a>b ?a:b ).get();
        System.out.println("Maximum element is : " + max);
    }
}
