package gangoffour.behavioral.iterator.collections;

import gangoffour.behavioral.iterator.domain.Notification;
import gangoffour.behavioral.iterator.iterators.Iterator;
import gangoffour.behavioral.iterator.iterators.NotificationIterator;

/**
 * Clients do not create iterators on their own but instead retrieve them from collection.
 * This way we make sure that the iterator we are using is compatible with that particular collection.
 */
public class NotificationCollection implements Collection {

    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private final Notification[] notificationList;

    public NotificationCollection() {
        notificationList = new Notification[MAX_ITEMS];

        // Let us add some dummy notifications
        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    public void addItem(String str) {
        Notification notification = new Notification(str);
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Full");
        else {
            notificationList[numberOfItems] = notification;
            numberOfItems = numberOfItems + 1;
        }
    }

    // Just makes the collection iterable
    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }

}
