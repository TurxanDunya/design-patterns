package gangoffour.behavioral.visitor.filesystem;

import gangoffour.behavioral.visitor.visitors.Visitor;

public class XMLFile extends File {

    public XMLFile(String name) {
        super(name);
    }

    @Override
    public void open() {
        System.out.println("XML file is opening...");
    }

    @Override
    public void read() {
        System.out.println("XML file is reading...");
    }

    // Instead of getting Visitor object, we sent this object to visitor. This is the KEY.
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
