package gangoffour.structural.decorator;

/**
 * Concrete component. Object to be decorated
 */
public class TextMessage implements Message {

    // Notice that, it is just a String since it is the main functional class.
    private final String message;

    public TextMessage(String message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return message;
    }

}