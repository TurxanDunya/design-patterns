package gangoffour.structural.proxy.virtual;

import java.awt.geom.Point2D;

public class Client {
    public static void main(String[] args) {
        Image image = ImageFactory.getImage("img.bmp");

        image.setLocation(new Point2D.Float(10, 10));
        System.out.println("Image location :" + image.getLocation());
        System.out.println("rendering img now...");

        image.render();
    }
}