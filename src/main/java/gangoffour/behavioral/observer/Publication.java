package gangoffour.behavioral.observer;

import gangoffour.behavioral.observer.subscriber.Subscriber;

public interface Publication {

    void setName(String name);

    String getName();

    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void publish(String date);

}
