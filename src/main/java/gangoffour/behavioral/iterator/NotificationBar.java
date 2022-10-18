package gangoffour.behavioral.iterator;

import gangoffour.behavioral.iterator.collections.NotificationCollection;
import gangoffour.behavioral.iterator.domain.Notification;
import gangoffour.behavioral.iterator.iterators.Iterator;

public class NotificationBar {

    private final NotificationCollection notifications;

    public NotificationBar(NotificationCollection notifications) {
        this.notifications = notifications;
    }

    public void printNotifications() {
        Iterator iterator = notifications.createIterator();
        while (iterator.hasNext()) {
            Notification n = (Notification) iterator.next();
            System.out.println(n.getNotification());
        }
    }

}
