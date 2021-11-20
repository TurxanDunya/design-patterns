package gangoffour.structural.proxy.dynamic;

import gangoffour.structural.proxy.virtual.Image;

import java.awt.geom.Point2D;

/**
 * Dynamic proxy happens at runtime.
 */
public class Client {
    public static void main(String[] args) {
        Image image = ImageFactory.getImage();
        image.setLocation(new Point2D.Float());
    }
}