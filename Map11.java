import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//0C==32F
public class Map11 {
    public static void main(String[] args){
        List<Double>temp= Arrays.asList(0.0,20.0,30.0);
        ArrayList<Double>list=new ArrayList<Double>();
        list.addAll(temp);
        System.out.println(list);
        List<Double>temp1=list.stream().
                map(n->(n*9/5)+32).
                toList();
        System.out.println(temp1);
    }
}
