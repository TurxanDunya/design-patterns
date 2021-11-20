package gangoffour.structural.proxy.virtual;

/**
 * Factory to get image objects
 */
public class ImageFactory {

    /**
     * We'll provide proxy to caller instead of real object
     * Proxy will look at if everything is okay. If not, it will take care.
     * And with this factory, client is not aware that works with proxy.
     */
    public static Image getImage(String name) {
        return new ImageProxy(name);
    }

}