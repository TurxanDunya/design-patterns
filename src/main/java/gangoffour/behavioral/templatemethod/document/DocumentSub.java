package gangoffour.behavioral.templatemethod.document;

public class DocumentSub extends Document {

    @Override
    void save() {
        System.out.println("Saving document...");
    }

    @Override
    void open() {
        System.out.println("Opening document...");
    }

}
