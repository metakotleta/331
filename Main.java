public class Main {

    public static void main(String[] args) {

        UserLA userLA = new UserLA("Василий");
        UserSR userSR = new UserSR("Анатолий");

        userSR.tookBook(userLA, "Война и мир");
        userLA.giveBook(userSR, "Война и мир");
        userLA.overdueNotification(userSR, "Война и мир");
        userSR.returnBook(userLA, "Война и мир");

        userLA.orderBooks(userSR, "Гарри Поттер");
        userSR.bringBooks(userLA, "Гарри Поттер");
    }
}
