package gangoffour.structural.proxy;

public class Client {
    public static void main(String[] args) {
        Minister minister = new ProxyImpl();
        minister.listenToCitizens(1232);
        minister.makeNote("Some note", false);
        minister.printPapers();
    }
}
