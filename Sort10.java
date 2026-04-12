import java.util.Arrays;
import java.util.List;
//Question no 10 and 11
public class Sort10 {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Ravi","Ankit","Zoya","Meena","Kunal");
        System.out.println(list);
        List<String> alphabiticaliy=list.stream().sorted((a,b)-> b.compareTo(a)).toList();
        System.out.println(alphabiticaliy);
    }
}