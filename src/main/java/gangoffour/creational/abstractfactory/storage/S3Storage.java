package gangoffour.creational.abstractfactory.storage;

// Represents a concrete product in a family "Amazon Web Services"
public class S3Storage implements Storage{

    public S3Storage(int capacityInMb) {
        System.out.println("Allocated " + capacityInMb + " on S3Storage");
    }

    @Override
    public String getId() {
        return "S31";
    }

    @Override
    public String toString() {
        return "S3Storage";
    }
}
