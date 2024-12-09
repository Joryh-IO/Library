public class Book {
    private String name;
    private int serial_no;
    private String author;
    private boolean availability;
    int quantity;
    Book(String name, boolean availability){
        this.name = name;
        this.availability = availability;
    }
    Book(String name, int serial_no, boolean availability, int quantity){
        this(name, availability);
        this.serial_no = serial_no;
        this.quantity = quantity;
    }
    Book(String name, int serial_no, boolean availability, int quantity,String author){
        this(name, serial_no,availability,quantity);
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }

    public int getSerial_no() {
        return serial_no;
    }

    public String getName() {
        return name;
    }

    public void borrowed(){
        if(isAvailability()) quantity--;
        if(quantity == 0)availability = false;
        System.out.println("Book Borrowed");
    }

    public void returned(){
        quantity++;
        System.out.println("Book received");
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean a){
        availability = a;
    }

    public String toString(){
        return "------------------------------\n" +
                "Title:"+name+
                "\nSerial no:"+serial_no
                +"\nAuthor:"+author
                +"\nQuantity:"+quantity
                +"\nAvailability:"+availability+
                "\n------------------------------";
    }
}

