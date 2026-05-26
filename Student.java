import java.util.ArrayList;

public class Student extends Person {

    private String department;

    // List of borrowed books
    private ArrayList<Book> borrowedBooks;

    // Constructor
    public Student(int id, String name, String department) {
        super(id, name);

        this.department = department;
        borrowedBooks = new ArrayList<>();
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Borrow book
    public void borrowBook(Book book) {

        // Max 3 books rule
        if (borrowedBooks.size() >= 3) {
            throw new RuntimeException("Borrow limit exceeded!");
        }

        borrowedBooks.add(book);
    }

    // Return book
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    // Method overriding -> polymorphism
    @Override
    public void displayDetails() {

        System.out.println("Student ID : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Department : " + department);

        System.out.println("Borrowed Books:");

        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println("- " + book.getBookName());
            }
        }

        System.out.println("--------------------------");
    }
}