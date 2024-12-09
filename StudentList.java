import java.util.ArrayList;

public class StudentList {
    ArrayList<Student> s = new ArrayList<Student>();
    StudentList(){
        Student a = new Student("Cassy", 101);
        Student b = new Student("Barry", 102);
        Student c = new Student("Harry", 103);
        s.add(a);
        s.add(b);
        s.add(c);
    }

    public void register(Student a){
        s.add(a);
    }
    public void show(){
        for(Student x:s){
            System.out.println(x);
        }
    }

    public void search()
}
