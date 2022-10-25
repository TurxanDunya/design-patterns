package gangoffour.behavioral.visitor.visitors;

import gangoffour.behavioral.visitor.filesystem.TextFile;
import gangoffour.behavioral.visitor.filesystem.XMLFile;

public class FileVisitor implements Visitor {

    @Override
    public void visit(TextFile textFile) {
        validate(textFile.name);
    }

    @Override
    public void visit(XMLFile xmlFile) {
        convert(xmlFile.name);
    }

    private void validate(String name) {
        System.out.println("File " + name + " has validated");
    }

    private void convert(String name) {
        System.out.println("File " + name + " has converted");
    }

}
