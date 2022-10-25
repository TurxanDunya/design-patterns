package gangoffour.behavioral.visitor.filesystem;

import gangoffour.behavioral.visitor.visitors.Visitor;

public class TextFile extends File {

    public TextFile(String name) {
        super(name);
    }

    @Override
    public void open() {
        System.out.println("Text file is opening...");
    }

    @Override
    public void read() {
        System.out.println("Text file is reading...");
    }

    // Instead of getting Visitor object, we sent this object to visitor. This is the KEY.
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
