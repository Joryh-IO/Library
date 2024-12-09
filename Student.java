import java.util.ArrayList;

public class Student {
    ArrayList<String> books = new ArrayList<String>();
    Library l;
    String name;
    int id;
    Student(Library l, String name, int id){
        this.l = l;
        this.name = name;
        this.id = id;
    }
    Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void borrow(Book a){
        if(l.search_book(a.getSerial_no())){
            a.borrowed();
            books.add(a.getName());
        }
    }
    public void returnBook(int a){
        if(l.search_book(a)){
            l.localBook.returned();
        }
        else System.out.println("Book does not belong to this Library :) ");
    }

    public void showBooks(){
        System.out.println(books);
    }

    public String toString(){
        return "Name:"+name+"\nId:"+id;
    }

}
