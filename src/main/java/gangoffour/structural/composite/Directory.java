package gangoffour.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * COMPOSITE in the composite pattern.
 *
 * This composite class keeps all abstract class implementers children inside in.
 * And does some operations on them. So, Directory class composites all implementations.
 *
 * If you look carefully,
 * you will notice there is both "is a" and "has a" relationship between Directory and File.
 */
public class Directory extends File {

    // Keeps children list in itself
    private final List<File> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void changePath() {
        System.out.println(getName());
        children.forEach(File::changePath);
    }

    @Override
    public void addFile(File file) {
        children.add(file);
    }

    @Override
    public File[] getFiles() {
        return children.toArray(new File[children.size()]);
    }

    @Override
    public boolean removeFile(File file) {
        return children.remove(file);
    }

}