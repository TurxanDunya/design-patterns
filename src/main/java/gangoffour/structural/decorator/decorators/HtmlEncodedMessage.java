package gangoffour.structural.decorator.decorators;

import gangoffour.structural.decorator.Message;
import org.apache.commons.lang3.StringEscapeUtils;

/**
 * Decorator. Implements component interface
 */
public class HtmlEncodedMessage implements Message {

    // Notice that, in this case we injected Message interface for its functionalities
    private final Message message;

    public HtmlEncodedMessage(Message message) {
        this.message = message;
    }

    // We added new behaviour as HTML4 functionality
    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml4(message.getContent());
    }

}