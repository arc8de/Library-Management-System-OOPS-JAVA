public class Book {

    // Encapsulation -> private variables
    private int bookId;
    private String bookName;
    private String authorName;
    private boolean isAvailable;

    // Constructor
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.isAvailable = true;
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter
    public void setAvailability(boolean status) {
        this.isAvailable = status;
    }

    // Display Book Details
    public void displayBook() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author : " + authorName);
        System.out.println("Available : " + isAvailable);
        System.out.println("--------------------------");
    }
}