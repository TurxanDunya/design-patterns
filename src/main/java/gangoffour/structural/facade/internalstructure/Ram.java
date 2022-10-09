package gangoffour.structural.facade.internalstructure;

import java.util.Arrays;

public class Ram {

    private byte[] data;

    public void load(byte[] data) {
        this.data = data;
        System.out.println(Arrays.toString(data) + " is loaded");
    }

    public byte[] access() {
        return this.data;
    }

    public void release(byte[] data) {
        System.out.println(Arrays.toString(data) + " is released");
    }

}
