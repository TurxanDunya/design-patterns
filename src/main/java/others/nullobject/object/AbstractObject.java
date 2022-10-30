package others.nullobject.object;

/**
 * By creating NullObject, we sure that client will not get NullPointerException.
 * Because we have already defined what have to do if our returned object is null.
 * Java Optional is handled this design pattern already.
 */
public abstract class AbstractObject {

    public abstract void getNecessaryObject();

}
