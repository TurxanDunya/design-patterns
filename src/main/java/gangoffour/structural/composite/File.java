package gangoffour.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The component base class for composite pattern defines operations applicable both leaf & composite.
 * Composite uses this interface to reach its leafs. Also, clients use this class
 */
@Data
@AllArgsConstructor
public abstract class File {

    private String name;

    public abstract void changePath();

    public abstract void addFile(File file);

    public abstract File[] getFiles();

    public abstract boolean removeFile(File file);

}