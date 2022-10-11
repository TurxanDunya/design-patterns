package gangoffour.structural.decorator;

public class Client {
    public static void main(String[] args) {
        /*
         * TextMessage is just a simple object. We just create it.
         * And instead of "HtmlEncodedMessage extends TextMessage" relation, we use "has a" relation.
         */
        Message m = new TextMessage("The <FORCE> is strong with this one!");
        System.out.println(m.getContent());

        /*
         * And look at it. We sent our base object to decorator to decorate it.
         */
        Message decorator = new HtmlEncodedMessage(m);
        System.out.println(decorator.getContent());

        // Base64 as text
        decorator = new Base64EncodedMessage(decorator);
        System.out.println(decorator.getContent());
    }
}