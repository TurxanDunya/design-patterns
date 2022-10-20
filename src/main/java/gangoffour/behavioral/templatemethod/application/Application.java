package gangoffour.behavioral.templatemethod.application;

import gangoffour.behavioral.templatemethod.document.Document;
import java.util.ArrayList;
import java.util.List;

/**
 * SKELETON OF AN ALGORITHM
 * Just focus on this class. As you see, we have a template method.
 * And all others methods implemented by subclasses.
 *
 * It is similar to strategy pattern.
 */
public abstract class Application {

    private static final List<Document> documents = new ArrayList<>();

    // This is template method
    public void openDocument(String fileName) {
        if (canOpenDocument(fileName)) {
            Document document = createDocument(fileName);
            addDocument(document);
            openDocument(document);
        }
    }

    abstract boolean canOpenDocument(String fileName);

    abstract Document createDocument(String fileName);

    abstract void openDocument(Document document);

    // As you see this is general method for implementing general algorithm.
    // It is also called as "hook", because it relates general algorithm to specific algorithms.
    void addDocument(Document document) {
        documents.add(document);
    }

}
