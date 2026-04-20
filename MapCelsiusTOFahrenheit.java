package Practice_Question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapCelsiusTOFahrenheit {
    public static void main(String[] args){
        List<Double> list = Arrays.asList(32.0,36.1,20.00,40.01);
        System.out.println(list);
        Stream<Double>res= list.stream();
        List<Double> res1= res.map(n-> (n*9/5)+32).collect(Collectors.toList());
        System.out.println(res1);
    }
}
