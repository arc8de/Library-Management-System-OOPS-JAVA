import java.util.ArrayList;

public class Library implements LibraryOperations {

    private ArrayList<Book> books;
    private ArrayList<Student> students;

    public Library() {

        books = new ArrayList<>();
        students = new ArrayList<>();
    }

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book Added Successfully!");
    }

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added Successfully!");
    }

   // View All Books
    public void viewBooks() {

    // Check if no books exist
    if (books.isEmpty()) {

        System.out.println("No books available in library.");

        return;
    }

    System.out.println("\n===== BOOK LIST =====");

    for (Book book : books) {

        System.out.println("Book ID : " + book.getBookId());

        System.out.println("Book Name : " + book.getBookName());

        System.out.println("Author Name : " + book.getAuthorName());

        System.out.println("Available : " + book.isAvailable());

        System.out.println("--------------------------");
    }
}

    // Find Book
    public Book findBook(int bookId) {

        for (Book book : books) {

            if (book.getBookId() == bookId) {
                return book;
            }
        }

        return null;
    }

    // Find Student
    public Student findStudent(int studentId) {

        for (Student student : students) {

            if (student.id == studentId) {
                return student;
            }
        }

        return null;
    }

    // Issue Book
    @Override
    public void issueBook(int bookId, int studentId) {

        try {

            Book book = findBook(bookId);

            Student student = findStudent(studentId);

            if (book == null) {
                throw new RuntimeException("Book not found!");
            }

            if (student == null) {
                throw new RuntimeException("Student not found!");
            }

            if (!book.isAvailable()) {
                throw new RuntimeException("Book already issued!");
            }

            student.borrowBook(book);

            book.setAvailability(false);

            System.out.println("Book Issued Successfully!");

        } catch (Exception e) {

            System.out.println("Error : " + e.getMessage());
        }
    }

    // Return Book
    @Override
    public void returnBook(int bookId, int studentId) {

        try {

            Book book = findBook(bookId);

            Student student = findStudent(studentId);

            if (book == null || student == null) {
                throw new RuntimeException("Invalid ID entered!");
            }

            if (!student.getBorrowedBooks().contains(book)) {
                throw new RuntimeException("Student did not borrow this book!");
            }

            student.returnBook(book);

            book.setAvailability(true);

            System.out.println("Book Returned Successfully!");

        } catch (Exception e) {

            System.out.println("Error : " + e.getMessage());
        }
    }

    // View Student Details
    public void viewStudentDetails(int studentId) {

        Student student = findStudent(studentId);

        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        student.displayDetails();
    }
}