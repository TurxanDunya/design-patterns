package solidprinciples.dependencyinversion;

import java.util.List;

/**
 * A. High level modules should not depend upon low level modules.
 * Both should depend upon abstraction.
 *
 * B. Abstractions should not depend upon details.
 * Details should depend upon abstraction.
 */
public class DependencyInversion {

    /**
     * Spring framework dependency inversion is best example of that.
     * Dependency - is something for to be able to write our code. For example: InputStream
     */

    interface Message {
        void sendMessage();
    }

    public class Email implements Message {

        @Override
        public void sendMessage() {
            sendEmail();
        }

        private void sendEmail() {
            //Send email
        }
    }

    public class SMS implements Message {

        @Override
        public void sendMessage() {
            sendSMS();
        }

        private void sendSMS() {
            //Send sms
        }
    }

    public class Notification {

        private List<Message> messages;

        public Notification(List<Message> messages) {
            this.messages = messages;
        }

        public void sender() {
            for (Message message : messages) {
                message.sendMessage();
            }
        }
    }
}
