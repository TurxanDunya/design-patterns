package gangoffour.behavioral.visitor.filesystem;

import gangoffour.behavioral.visitor.visitors.Visitor;

public abstract class File {

    public String name;

    public File(String name) {
        this.name = name;
    }

    public abstract void open();

    public abstract void read();

    public abstract void accept(Visitor visitor);

}
