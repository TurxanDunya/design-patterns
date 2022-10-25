package gangoffour.behavioral.visitor.visitors;

import gangoffour.behavioral.visitor.filesystem.TextFile;
import gangoffour.behavioral.visitor.filesystem.XMLFile;

/**
 * We can create multiple visitor implementations such as FileModerator, FileManager etc.
 * Creating general interface for these implementations is more SOLID.
 */
public interface Visitor {

    void visit(TextFile textFile);

    void visit(XMLFile xmlFile);

}
