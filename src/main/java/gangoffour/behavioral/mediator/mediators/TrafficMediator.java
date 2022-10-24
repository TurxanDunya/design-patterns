package gangoffour.behavioral.mediator.mediators;

import gangoffour.behavioral.mediator.objects.Vehicle;

public interface TrafficMediator {

    void receive(Vehicle vehicle);

    void askPermitToPass(Vehicle vehicle);

    void done(Vehicle vehicle);

}
