import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class Student{
   private  int sid;
    private String name;
    private int marks;

    public Student(String name) {
        this.name = name;
    }

    public Student(int marks) {
        this.marks = marks;
    }

    public Student() {
    }

    public Student(int i, String s, int i1) {
    }

    public int getMarks() {
        return 0;
    }
}
public class Filter16 {
    public static void main(String[]args){
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"Student 1",60));
        list.add(new Student(2,"Student 1",70));
        list.add(new Student(3,"Student 1",45));
        list.add(new Student(4,"Student 1",75));
        list.add(new Student(5,"Student 1",90));
        List<Student> g60=list.stream().
                filter(student -> student.getMarks()>60)
                .toList();
        g60.stream().forEach(System.out::println);

    }
}
