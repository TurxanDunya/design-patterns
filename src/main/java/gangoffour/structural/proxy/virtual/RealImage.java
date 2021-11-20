package gangoffour.structural.proxy.virtual;

import java.awt.geom.Point2D;

/**
 * Concrete class providing actual functionality.
 */
public class RealImage implements Image {

    private Point2D location;
    private String name;

    public RealImage(String filename) {
        //Loads image from file on disk
        System.out.println("Loaded from disk: " + filename);
        name = filename;
    }

    @Override
    public void setLocation(Point2D point2D) {
        location = point2D;
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void render() {
        //renders to screen
        System.out.println("Rendered " + this.name);
    }

}