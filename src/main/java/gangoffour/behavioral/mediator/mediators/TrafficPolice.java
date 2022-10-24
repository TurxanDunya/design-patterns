package gangoffour.behavioral.mediator.mediators;

import gangoffour.behavioral.mediator.Junction;
import gangoffour.behavioral.mediator.objects.Vehicle;
import java.util.ArrayList;
import java.util.List;

/**
 * This is mediator class. Car objects just uje this mediator to pass through junction.
 * Instead of car-junction relation, car-mediator-junction relation has happened.
 * And car can only think about how to pass through a junction, without knowing its state.
 * Mediator will provide it.
 */
public class TrafficPolice implements TrafficMediator {

    private String name;
    private final Junction junction;
    private final List<Vehicle> vehicles;

    public TrafficPolice(String name, Junction junction) {
        this.name = name;
        this.junction = junction;
        vehicles = new ArrayList<>();
        System.out.println("TrafficPolice " + name + " has created");
    }

    @Override
    public void receive(Vehicle vehicle) {
        vehicle.stopVehicle();
        vehicles.add(vehicle);
    }

    @Override
    public void askPermitToPass(Vehicle vehicle) {
        if (!junction.isBusy()) {
            junction.setBusy(true);
            vehicle.proceed();
        } else {
            vehicle.waitForAWhile();
        }
    }

    @Override
    public void done(Vehicle vehicle) {
        vehicles.remove(vehicle);
        junction.setBusy(false);
    }

}
