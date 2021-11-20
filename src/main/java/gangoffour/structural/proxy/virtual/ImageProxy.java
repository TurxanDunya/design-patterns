package gangoffour.structural.proxy.virtual;

import java.awt.geom.Point2D;

/**
 * Proxy class. So, what happens here?
 * We try to provide real object for proceeding. If not, proxy object jump into scenario.
 * And takes care of functionality of these methods. (setLocation(), getLocation() and render()).
 */
public class ImageProxy implements Image {

    private String name;

    // reference to real object
    private RealImage image;

    private Point2D location;

    public ImageProxy(String name) {
        this.name = name;
    }

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
        } else {
            return location;
        }
    }

    @Override
    public void render() {
        if (image == null) {
            image = new RealImage(name);
            if (location != null) {
                image.setLocation(location);
            }
        }

        image.render();
    }

}