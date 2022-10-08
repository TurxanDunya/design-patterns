package gangoffour.structural.composite;

public class Client {

    // You can use which way you will create your tree. You can use composite or simple implementation.
    // We changed all file paths at once while directory has changed.
    public static void main(String[] args) {
        File root1 = createTreeOne();
        root1.changePath();
        System.out.println("-------------------------");
        File root2 = createTreeTwo();
        root2.changePath();
    }

    // Client builds tree using composite. So, in this case, all leaf objects has same properties.
    private static File createTreeOne() {
        File file = new BinaryFile("File", "/local");
        Directory direction = new Directory("Direction");
        direction.addFile(file);
        return direction;
    }

    // Client builds tree using just leaf
    private static File createTreeTwo() {
        return new BinaryFile("Another File", "/local");
    }

}