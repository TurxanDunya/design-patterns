package gangoffour.structural.proxy.dynamic;

import gangoffour.structural.proxy.virtual.Image;

import java.awt.geom.Point2D;

public class BitmapImage implements Image {

    private Point2D location;
    private String name;

    public BitmapImage(String filename) {
        //Loads image from file or disk
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
