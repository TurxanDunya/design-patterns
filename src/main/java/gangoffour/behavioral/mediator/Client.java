package gangoffour.behavioral.mediator;

import gangoffour.behavioral.mediator.mediators.TrafficPolice;
import gangoffour.behavioral.mediator.objects.Car;

public class Client {
    public static void main(String[] args) {
        Junction junction = new Junction("Flower");
        TrafficPolice trafficPolice = new TrafficPolice("Jacob", junction);

        // Define an thread array
        int numberOfCars = 5;
        Thread[] cars = new Thread[numberOfCars];

        // Fill thread objects
        for (int i = 0; i < numberOfCars; i++) {
            Thread car = new Car("Car" + i, junction, trafficPolice, true);
            cars[i] = car;
        }

        // And run threads one-by-one
        for (Thread car: cars) {
            car.start();
        }
    }
}
