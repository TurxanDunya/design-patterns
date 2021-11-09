package gangoffour.structural.proxy.virtual;

import java.awt.geom.Point2D;

//It is virtual proxy
public class ImageProxy implements Image {

    private String name;
    private Point2D location;
    private BitmapImage image; //Reference to real object

    public ImageProxy(String name) {
        this.name = name;
    }

    //if BitmapImage object is exist then setlocation
    //if not then use this object
    @Override
    public void setLocation(Point2D point2D) {
        if (image != null) {
            image.setLocation(point2D);
        } else {
            location = point2D;
        }
    }

    @Override
    public Point2D getLocation() {
        if (image != null) {
            return image.getLocation();
        }
        return location;
    }

    @Override
    public void render() {
        if (image == null) {
            image = new BitmapImage(name);
            if (location != null) {
                image.setLocation(location);
            }
        }
        image.render();
    }
}
