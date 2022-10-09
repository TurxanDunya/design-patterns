package gangoffour.structural.facade;

import gangoffour.structural.facade.internalstructure.Cpu;
import gangoffour.structural.facade.internalstructure.Gpu;
import gangoffour.structural.facade.internalstructure.Ram;

/**
 * Computer is facade.
 */
public class Computer {

    private static final byte[] data = new byte[]{12, 34, 2, 5, 32};

    private final Ram ram = new Ram();
    private final Cpu cpu = new Cpu();
    private final Gpu gpu = new Gpu();

    /**
     * Start method handles all complexity.
     * Client does not know anything about internal complexity.
     */
    public void start() {
        cpu.process(data);
        ram.load(data);
        ram.access();
        gpu.present(data);
        ram.release(data);
    }

}
