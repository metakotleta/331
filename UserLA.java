import library_interfaces.*;

public class UserLA extends User implements Librarian, Administrator {

    public UserLA(String username) {
        super(username);
    }

    @Override
    public void overdueNotification(Reader reader, String book) {
        System.out.println("Отправлено напоминание пользователю " + reader
                + " о просрочке возврата книги " + book);
    }

    @Override
    public void giveBook(Reader reader, String book) {
        Administrator.super.giveBook(reader, book); // было интересно, как оно работает)
    }

    @Override
    public void orderBooks(Supplier supplier, String book) {
        System.out.println("Книга " + book + " заказана у поставщика " + supplier);
    }
}
