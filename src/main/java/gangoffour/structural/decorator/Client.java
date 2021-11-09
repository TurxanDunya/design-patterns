package gangoffour.structural.decorator;

public class Client {
    public static void main(String[] args) {
        // Simple plain java
        Message m = new TextMessage("The <FORCE> is strong with this one!");
        System.out.println(m.getContent());

        // HTML4 as text
        Message decorator = new HtmlEncodedMessage(m);
        System.out.println(decorator.getContent());

        // Base64 as text
        decorator = new Base64EncodedMessage(decorator);
        System.out.println(decorator.getContent());
    }
}