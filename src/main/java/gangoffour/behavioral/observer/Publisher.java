package gangoffour.behavioral.observer;

import gangoffour.behavioral.observer.subscriber.Subscriber;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Publisher implements Publication {

    private String name;
    private List<Subscriber> subscribers;

    public Publisher(String name) {
        this.name = name;
        subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void publish(String date) {
        name = name + " in " + date;
        for (Subscriber subscriber : subscribers) {
            subscriber.receive(this);
        }
    }

}
