package gangoffour.creational.objectPool;

//concrete reusable
public class Bitmap implements Image {

    private String location;

    private String objectName;

    public Bitmap(String objectName) {
        this.objectName = objectName;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + objectName + " @" + location);
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void reset() {
        location = "";
        System.out.println("Bitmap is reset");
    }

}