package library_interfaces;

public interface Reader {

    void tookBook(Librarian librarian, String book);
    void returnBook(Librarian librarian, String book);
}
