package gangoffour.creational.prototype.shallowcopy;

/**
 * We have a complex object that is costly to create.
 * To create more instances of such class, we use an existing instance as our prototype.
 * Difference from Singleton is that, we copy an existing object to create a separate new object.
 *
 * In SHALLOW COPY, two different reference look at same object but...
 * In DEEP COPY, the original and the copied objects are independent of each other
 * and therefore the objects can update their own fields without worrying about any referencing problems.
 *
 * If an object has only primitive fields or immutable objects, use a shallow copy.
 * When the object has references to other mutable objects, then either choose shallow copy or deep copy.
 *
 * When you go for a deep copy, you will need to override the Object.clone() method in all the member classes
 * and then recursively clone their objects.
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman swordsman = new Swordsman();
        swordsman.attack();
        System.out.println(swordsman); // Output

        Swordsman swordsmanCopy = (Swordsman) swordsman.clone();
        System.out.println("Cloned: " + swordsmanCopy);

        // Remember, same operation is not valid for General. So, it will throw Exception

        General general = new General();
        general.boostMorale();
        System.out.println(general);

//        General generalCopy = (General) general.clone();
//        System.out.println(generalCopy);
    }

    // https://springframework.guru/gang-of-four-design-patterns/prototype-pattern/
}
