package gangoffour.behavioral.templatemethod;

import gangoffour.behavioral.templatemethod.application.Application;
import gangoffour.behavioral.templatemethod.application.ApplicationSub;

public class Client {
    public static void main(String[] args) {
        Application application = new ApplicationSub();
        application.openDocument("exampledoc");
    }
}
