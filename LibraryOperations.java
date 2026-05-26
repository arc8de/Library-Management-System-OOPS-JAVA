public interface LibraryOperations {

    void issueBook(int bookId, int studentId);

    void returnBook(int bookId, int studentId);
}