package gangoffour.behavioral.iterator.iterators;

import gangoffour.behavioral.iterator.domain.Notification;

public class NotificationIterator implements Iterator {

    private final Notification[] notificationList;

    // Maintains current position of iterator over the array
    int pos = 0;

    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public Object next() {
        // return next element in the array and increment pos
        Notification notification = notificationList[pos];
        pos += 1;
        return notification;
    }

    @Override
    public boolean hasNext() {
        return pos < notificationList.length && notificationList[pos] != null;
    }

}
