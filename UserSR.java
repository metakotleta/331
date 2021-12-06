import library_interfaces.*;

public class UserSR extends User implements Supplier, Reader {

    public UserSR(String username) {
        super(username);
    }

    @Override
    public void tookBook(Librarian librarian, String book) {
        System.out.println("Взята книга " + book + " у " + librarian);
    }

    @Override
    public void returnBook(Librarian librarian, String book) {
        System.out.println("Возвращена книга " + book + " библиатукарю " + librarian);
    }

    @Override
    public void bringBooks(Administrator admin, String book) {
        System.out.println("Администратором " + admin + " заказана книга " + book);
    }
}
