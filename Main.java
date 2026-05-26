import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        while (true) {

            System.out.println("\n===== Library Management System =====");

            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Add Student");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. View Student Details");
            System.out.println("7. Exit");

            System.out.print("Enter choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID : ");
                    int bookId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Book Name : ");
                    String bookName = sc.nextLine();

                    System.out.print("Enter Author Name : ");
                    String author = sc.nextLine();

                    Book book = new Book(bookId, bookName, author);

                    library.addBook(book);

                    break;

                case 2:

                    library.viewBooks();

                    break;

                case 3:

                    System.out.print("Enter Student ID : ");
                    int studentId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name : ");
                    String studentName = sc.nextLine();

                    System.out.print("Enter Department : ");
                    String dept = sc.nextLine();

                    Student student =
                            new Student(studentId, studentName, dept);

                    library.addStudent(student);

                    break;

                case 4:

                    System.out.print("Enter Book ID : ");
                    int issueBookId = sc.nextInt();

                    System.out.print("Enter Student ID : ");
                    int issueStudentId = sc.nextInt();

                    library.issueBook(issueBookId, issueStudentId);

                    break;

                case 5:

                    System.out.print("Enter Book ID : ");
                    int returnBookId = sc.nextInt();

                    System.out.print("Enter Student ID : ");
                    int returnStudentId = sc.nextInt();

                    library.returnBook(returnBookId, returnStudentId);

                    break;

                case 6:

                    System.out.print("Enter Student ID : ");

                    int viewStudentId = sc.nextInt();

                    library.viewStudentDetails(viewStudentId);

                    break;

                case 7:

                    System.out.println("Exiting...");

                    sc.close();

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}