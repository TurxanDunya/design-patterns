package gangoffour.behavioral.templatemethod.application;

import gangoffour.behavioral.templatemethod.document.Document;
import gangoffour.behavioral.templatemethod.document.DocumentSub;

public class ApplicationSub extends Application {

    @Override
    boolean canOpenDocument(String fileName) {
        System.out.println("Checking the document: " + fileName);
        return true;
    }

    @Override
    Document createDocument(String fileName) {
        System.out.println("Opening document: " + fileName);
        return new DocumentSub();
    }

    @Override
    void openDocument(Document document) {
        System.out.println("Opening the file...");
    }

}
