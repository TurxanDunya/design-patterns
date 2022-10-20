package gangoffour.behavioral.observer.subscriber;

import gangoffour.behavioral.observer.Publication;

public interface Subscriber {

    void receive(Publication publication);

}
