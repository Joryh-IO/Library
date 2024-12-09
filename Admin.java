public class Admin {
    Library l;
    Admin(Library l){
        this.l = l;
    }
    public void create_book(Book a){
        l.library.add(a);
        System.out.println("Book added!😊");
    }

    public void remove_book(int a){
        if(l.search_book(a)) {l.library.remove(a);System.out.println("Book removed!😭");}
        else System.out.println("Book not found :(");
    }
}
