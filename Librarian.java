public class Librarian extends Person {

    public Librarian(int id, String name) {
        super(id, name);
    }

    // Method overriding
    @Override
    public void displayDetails() {

        System.out.println("Librarian ID : " + id);
        System.out.println("Librarian Name : " + name);

        System.out.println("--------------------------");
    }
}