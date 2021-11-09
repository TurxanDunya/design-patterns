package gangoffour.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The component base class for composite pattern defines operations applicable both leaf & composite
 */
@Data
@AllArgsConstructor
public abstract class File {

    private String name;

    public abstract void operation();

    public abstract void addFile(File file);

    public abstract File[] getFiles();

    public abstract boolean removeFile(File file);

}