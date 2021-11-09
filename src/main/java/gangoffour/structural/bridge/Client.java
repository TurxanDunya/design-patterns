package gangoffour.structural.bridge;

public class Client {
    public static void main(String[] args) {
        // We seperated function implementations from client code
        System.out.println(new Abstraction(new ImplementationA()).operation());
        System.out.println(new Abstraction(new ImplementationB()).operation());
    }
}