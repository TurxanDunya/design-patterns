package gangoffour.structural.composite.leaf;

import gangoffour.structural.composite.File;

/**
 * LEAF node in composite pattern.
 * All child implementations are called LEAF in composite design pattern.
 */
public class BinaryFile extends File {

    private final String newPath;

    public BinaryFile(String name, String newPath) {
        super(name);
        this.newPath = newPath;
    }

    @Override
    public void changePath() {
        System.out.println(getName() + " changed to new path: " + newPath);
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("Leaf node doesn't support add operation");
    }

    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException("Leaf node doesn't support get operation");
    }

    @Override
    public boolean removeFile(File file) {
        throw new UnsupportedOperationException("Leaf node doesn't support remove operation");
    }

}