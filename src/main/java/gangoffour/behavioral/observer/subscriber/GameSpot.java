package gangoffour.behavioral.observer.subscriber;

import gangoffour.behavioral.observer.Publication;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class GameSpot implements Subscriber {

    @Override
    public void receive(Publication publication) {
        publishGameSpotNews(publication.getName());
    }

    void publishGameSpotNews(String publisherName) {
        System.out.println("GameSpot publishes breaking news: " + publisherName);
    }

}
