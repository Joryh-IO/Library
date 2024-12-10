import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentList {
//    Map<Integer, Student> m = new HashMap<Integer,Student>();
    ArrayList<Student> s = new ArrayList<Student>();
    StudentList(){
        Student a = new Student("Cassy", 101);
        Student b = new Student("Barry", 102);
        Student c = new Student("Harry", 103);
        s.add(a);
        s.add(b);
        s.add(c);
//        m.put(a.id,a);
//        m.put(b.id,b);
//        m.put(c.id,c);
    }

    public void register(Student a){
        s.add(a);
    }
    public void show(){
        for(Student x:s){
            System.out.println(x);
        }
    }

    public boolean search(String a, int b){
        int c=0;
        for(Student x: s){
            if(b == x.id && a.equals(x.name))return true;
            else c++;
        }
        if(c!=0)return false;
        else return true;
    }

    public void removeStudent(String name, int id){
        int c=0;
        for(Student x: s){
            if(id == x.id && name.equals(x.name)) {
                s.remove(x);
                return;
            }
            else c++;
        }
        if(c!=0)System.out.println("Student not found");

    }
}
