import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        Admin admin = new Admin(library);
        StudentList sl = new StudentList();
        Student s = new Student(library, "g", 12);

        int run=0;
        while (run==0) {
            System.out.println("\n----------- Library Management System -----------");
            System.out.println("1. Admin Module");
            System.out.println("2. Student Module");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            System.out.println("-------------------------------------------------");

            switch (choice) {
                case 1:
                    System.out.println("\nAdmin Module!!");
                    System.out.println("1. Add Book");
                    System.out.println("2. Remove Book");
                    System.out.println("3. View Books");
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
                    }

                case 2:{System.out.println("\nStudent Module!!");
                        System.out.println("********");
                        System.out.println("Enter you name to log-in");
                        String n = sc.nextLine();
                        System.out.println("Enter id");
                        int id = sc.nextInt();

                        System.out.println("********");
                        System.out.println("Show all books");
                        System.out.println("Borrow a book");
                        System.out.println("return a book");
                        }
                    }
            }
        }
    }
}
