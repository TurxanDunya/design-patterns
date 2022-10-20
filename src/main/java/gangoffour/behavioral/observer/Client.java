package gangoffour.behavioral.observer;

import gangoffour.behavioral.observer.subscriber.GameSpot;
import gangoffour.behavioral.observer.subscriber.IGN;

public class Client {
    public static void main(String[] args) {
        Publication publication = new Publisher("General News");
        publication.addSubscriber(new IGN());
        publication.addSubscriber(new GameSpot());
        // If we publish in this step, both will publish the latest game news

        publication.removeSubscriber(new GameSpot()); // Subscriber removed
        publication.publish("Yesterday"); // So, only IGN will publish
    }
}
