package gangoffour.behavioral.iterator.iterators;

// We could also use Java.Util.Iterator
public interface Iterator {

    // Indicates whether there are more elements to iterate over
    boolean hasNext();

    // Returns the next element
    Object next();

}
