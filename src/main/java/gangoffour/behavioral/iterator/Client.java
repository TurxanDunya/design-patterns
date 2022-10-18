package gangoffour.behavioral.iterator;

import gangoffour.behavioral.iterator.collections.NotificationCollection;

public class Client {
    public static void main(String[] args) {
        NotificationCollection nc = new NotificationCollection();
        NotificationBar nb = new NotificationBar(nc);
        nb.printNotifications();
    }
}
