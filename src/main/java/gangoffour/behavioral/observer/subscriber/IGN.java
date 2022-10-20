package gangoffour.behavioral.observer.subscriber;

import gangoffour.behavioral.observer.Publication;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class IGN implements Subscriber {

    @Override
    public void receive(Publication publication) {
        publishIGNews(publication.getName());
    }

    void publishIGNews(String publisherName) {
        System.out.println("IGN noticed breaking news and publish it: " + publisherName);
    }

}
