package library_interfaces;

public interface Administrator {

    void overdueNotification(Reader reader, String book);

    default void giveBook(Reader reader, String book) {
        System.out.println("Выдана книга " + book + " читателю " + reader);
    };
}
