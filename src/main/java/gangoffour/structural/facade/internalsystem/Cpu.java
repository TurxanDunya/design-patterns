package gangoffour.structural.facade.internalsystem;

import java.util.Arrays;

public class Cpu {

    public void process(byte[] data) {
        System.out.println(Arrays.toString(data) + " is processed");
    }

}
