package gangoffour.creational.objectPool;

// Represents our abstract reusable
public interface Image extends Poolable {

    void draw();

    String getLocation();

    void setLocation(String location);

}