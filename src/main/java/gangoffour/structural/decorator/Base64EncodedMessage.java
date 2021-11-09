package gangoffour.structural.decorator;

import java.util.Base64;

/**
 * Another decorator
 */
public class Base64EncodedMessage implements Message {

    // Notice that, in this case we injected Message interface for its functionalities
    private Message message;

    public Base64EncodedMessage(Message message) {
        this.message = message;
    }

    // We added new behaviour as Base64 encoding functionality
    @Override
    public String getContent() {
        return Base64.getEncoder().encodeToString(message.getContent().getBytes());
    }

}