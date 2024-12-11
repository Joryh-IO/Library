import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        Admin admin = new Admin(library);
        StudentList sl = new StudentList();
        Student s = new Student(library, "g", 12);


        System.out.println("\n----------- Library Management System -----------");
        System.out.println("1. Admin Module");
        System.out.println("2. Student Module");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.println("-------------------------------------------------");
        if (choice == 1) {
            int r = 0;
            while (r == 0) {
                System.out.println("\nAdmin Module!!");
                System.out.println("1. Add Book");
                System.out.println("2. Remove Book");
                System.out.println("3. View Books");
                System.out.println("4. Register Student");
                System.out.println("5. Remove Student");
                System.out.print("Enter your choice: ");
                int adminChoice = sc.nextInt();
                sc.nextLine();

                switch (adminChoice) {
                    case 1:
                        System.out.print("Enter Book Title");
                        String n = sc.nextLine();
                        System.out.println("Enter Serial no");
                        int no = sc.nextInt();
                        System.out.println("Enter quantity");
                        int q = sc.nextInt();
                        System.out.println("Enter author name");
                        String au = sc.nextLine();
                        Book b = new Book(n, no, true, q, au);
                        admin.create_book(b);
                        break;

                    case 2: {
                        System.out.println("Enter book ID to remove");
                        int id = sc.nextInt();
                        admin.remove_book(id);
                        break;
                    }

                    case 3: {
                        library.show();
                        break;
                    }

                    case 4: {
                        System.out.println("Enter you name to log-in");
                        String na = sc.nextLine();
                        System.out.println("Enter id");
                        int id = sc.nextInt();
                        Student a = new Student(na, id);
                        sl.register(a);
                        break;
                    }
                    case 5: {
                        System.out.println("Enter you name to log-in");
                        String na = sc.nextLine();
                        System.out.println("Enter id");
                        int id = sc.nextInt();
                        break;
                    }
                }
            }
        } else if (choice == 2) {
            int r = 0;
            System.out.println("\nStudent Module!!");
            System.out.println("********");
            System.out.println("Enter you name to log-in");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter id");
            int id = sc.nextInt();
            System.out.println("********");
            if (sl.search(name, id)) {
                while (r == 0) {
                    System.out.println("1. Show all books");
                    System.out.println("2. Borrow a book");
                    System.out.println("3. return a book");
                    System.out.println("Enter choice:");
                    int student_choice = sc.nextInt();
                    switch (student_choice) {
                        case 1: {
                            library.show();
                            break;
                        }
                        case 2: {
                            System.out.println("Enter book id to borrow");
                            int bid = sc.nextInt();
                            if (library.search_book(bid)) library.localBook.borrowed();
                            else System.out.println("Book not found");
                            break;
                        }
                        case 3: {
                            System.out.println("Enter book id to return");
                            int rid = sc.nextInt();
                            if (library.search_book(rid)) library.localBook.returned();
                            else System.out.println("Book not found");
                            break;
                        }
                        default:r=10;
                    }
                }
            } else {
                System.out.println("Student not found please register");
                System.out.println("code terminated");
            }
        }
    }
}

