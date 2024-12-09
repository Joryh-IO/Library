import java.util.*;
public class Library {
    public Book localBook;
     ArrayList<Book> library = new ArrayList<Book>();
    Library(){
        Book t1 = new Book("Pride and Prejudice", 111, true, 2, "Jane Austen");
        Book t2 = new Book("1984", 112, true, 3, "George Orwell");
        Book t3 = new Book("The Alchemist", 113, true, 1, "Paulo Coehlo");
        Book t4 = new Book("War and Peace", 114, true, 2, "Leo Tolstoy");
        library.add(t1);
        library.add(t2);
        library.add(t3);
        library.add(t4);

    }

    Scanner sc = new Scanner(System.in);


//    public void create_book(Book a){
//        library.add(a);
//        System.out.println("Book added!😊");
//
//    }
//
//    public void remove_book(Book a){
//        if(search_book(a.getSerial_no())) {library.remove(a);System.out.println("Book removed!😭");}
//        else System.out.println("Book not found :(");
//    }
    public boolean search_book(int a){
        int c = 0;
        for(int i=0; i<library.size(); i++){
            if(library.get(i).getSerial_no() == a ){
                localBook = library.get(i);
                c++;
                return true;
            }
        }
        if(c == 0)return false;
        else return true;
    }
    public void show(){
        for(Book x:library){
            System.out.println(x);
        }
    }

    public void show(Book a){
        int c=0;
        for(Book x:library){
            if(a.getSerial_no() == x.getSerial_no())System.out.println(x);
            else c++;
        }
        if(c==0)System.out.println("Error book not found :( ");
    }
}
